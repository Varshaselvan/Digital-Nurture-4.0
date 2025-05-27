function Event(name, date, seats) {
  this.name = name;
  this.date = date;
  this.seats = seats;
}

Event.prototype.checkAvailability = function() {
  return this.seats > 0;
};

const event1 = new Event("Coding Bootcamp", "2025-08-01", 20);

console.log(Object.entries(event1));
console.log(event1.checkAvailability());
