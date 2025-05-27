let events = [
  { name: "Painting", type: "art" },
  { name: "Jazz Night", type: "music" },
  { name: "Coding", type: "tech" },
];

events.push({ name: "Rock Concert", type: "music" });

const musicEvents = events.filter(e => e.type === "music");

const displayCards = events.map(e => `Event: ${e.name}`);
console.log(displayCards);
