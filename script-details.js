// Retrieve query parameters from URL.
const queryParams = new URLSearchParams(window.location.search);
const title = queryParams.get('title');
const year = queryParams.get('year');
const plot = queryParams.get('plot');

// Populate movie details on the details page.
document.getElementById('title').innerText = title;
document.getElementById('year').innerText = `Release Year: ${year}`;
document.getElementById('plot').innerText = `Plot: ${plot}`;
