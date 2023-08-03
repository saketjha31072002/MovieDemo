// Replace 'YOUR_API_KEY' with your actual OMDB API key.
const apiKey = 'YOUR_API_KEY';
const baseURL = 'http://www.omdbapi.com/';

function viewDetails() {
  fetch(`${baseURL}?apikey=${apiKey}&t=Movie Title`)
    .then(response => response.json())
    .then(data => {
      // Redirect to the movie details page with the data.
      window.location.href = `details.html?title=${data.Title}&year=${data.Year}&plot=${data.Plot}`;
    })
    .catch(error => {
      console.error('Error fetching movie details:', error);
    });
}