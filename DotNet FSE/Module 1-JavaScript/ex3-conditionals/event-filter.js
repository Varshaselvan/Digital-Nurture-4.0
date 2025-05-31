const events = [
  { name: "Yoga", date: "2025-06-01", seats: 5 },
  { name: "Music", date: "2024-01-01", seats: 10 },
  { name: "Art", date: "2025-07-01", seats: 0 },
];

events.forEach(event => {
  if (new Date(event.date) > new Date() && event.seats > 0) {
    console.log(`Upcoming: ${event.name}`);
  }
});

function register(user, event) {
  try {
    if (!user) throw "User not provided";
    console.log(`${user} registered for ${event}`);
  } catch (err) {
    console.error("Registration error:", err);
  }
}
