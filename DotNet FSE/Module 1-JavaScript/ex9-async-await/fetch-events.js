// Using Promises
fetch("https://jsonplaceholder.typicode.com/posts")
  .then(res => res.json())
  .then(data => console.log("Events:", data))
  .catch(err => console.error("Error:", err));

// Using async/await
async function loadEvents() {
  try {
    const res = await fetch("https://jsonplaceholder.typicode.com/posts");
    const data = await res.json();
    console.log("Async Events:", data);
  } catch (err) {
    console.error("Async Error:", err);
  }
}

loadEvents();
