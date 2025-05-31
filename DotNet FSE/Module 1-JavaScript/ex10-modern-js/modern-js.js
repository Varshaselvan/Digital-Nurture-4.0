const event = { name: "Tech Talk", date: "2025-08-15", location: "Hall A" };

function register({ name, date }) {
  console.log(`Registering for ${name} on ${date}`);
}

const newEvent = { ...event };
register(newEvent);
