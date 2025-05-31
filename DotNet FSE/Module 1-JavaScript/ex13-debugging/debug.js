console.log("Submitting form...");

function submitForm(data) {
  console.log("Data:", data);
  fetch("https://example.com", {
    method: "POST",
    body: JSON.stringify(data),
  })
    .then(res => res.json())
    .then(result => console.log("Server response:", result))
    .catch(err => console.error("Error:", err));
}
