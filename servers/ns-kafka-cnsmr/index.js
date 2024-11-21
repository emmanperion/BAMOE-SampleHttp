const { Kafka } = require('kafkajs');

const clientId = process.env.KAFKA_CLIENT_ID || 'my-app';
const groupId = process.env.KAFKA_GROUP_ID || 'pruOne';
const topic = process.env.KAFKA_TOPIC || 'test_topic';
const brokers = process.env.KAFKA_BROKERS.split(',') || ['kafka:9092'];

console.log('brokers: ', brokers);

const kafka = new Kafka({
  clientId,
  brokers,
});

const consumer = kafka.consumer({ groupId });

(async () => {
  await consumer.connect()
  await consumer.subscribe({ topic, fromBeginning: true })

  await consumer.run({
    eachMessage: async ({ topic, partition, message }) => {
      console.log({
        topic,
        value: message.value.toString(),
      })
    },
  })
})()
