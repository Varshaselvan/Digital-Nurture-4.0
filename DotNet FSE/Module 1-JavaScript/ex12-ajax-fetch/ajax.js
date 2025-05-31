const userData = { name: "Ravi", event: "Art Show" };

fetch("https://jsonplaceholder.typicode.com/posts", {
  method: "POST",
  headers: { "Content-Type": "application/json" },
  body: JSON.stringify(userData),
})
  .then(res => res.json())
  .then(data => {
    console.log("Success:", data);
    setTimeout(() => alert("Submitted successfully!"), 1000);
  })
  .catch(err => alert("Submission failed"));
