function addEvent(name) {
  console.log(`Event added: ${name}`);
}

function registerUser(user) {
  console.log(`${user} registered!`);
}

function filterEventsByCategory(events, category) {
  return events.filter(e => e.category === category);
}

// Closure example
function categoryCounter() {
  let count = 0;
  return function() {
    count++;
    console.log(`Registrations in category: ${count}`);
  };
}

const musicCounter = categoryCounter();
musicCounter();
musicCounter();
