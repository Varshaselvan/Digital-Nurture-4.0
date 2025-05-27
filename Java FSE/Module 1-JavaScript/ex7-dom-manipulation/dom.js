const container = document.querySelector("#eventContainer");

const event = { name: "Workshop", date: "2025-06-20" };
const card = document.createElement("div");
card.textContent = `${event.name} - ${event.date}`;
container.appendChild(card);
