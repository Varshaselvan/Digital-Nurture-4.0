<select id="categoryFilter">
  <option value="all">All</option>
  <option value="music">Music</option>
</select>

<input type="text" id="search" placeholder="Search event name">

<script>
document.getElementById("categoryFilter").onchange = function() {
  alert("Filter changed to: " + this.value);
};

document.getElementById("search").onkeydown = function(e) {
  console.log("Typing:", e.key);
};
</script>
