# weather-app
### A simple spring boot application which retrieves current weather details by calling the weather API on OpenWeather

OpenWeather API url : https://openweathermap.org/current

curl --location --request GET 'http://localhost:8080/weather?latitude=40.730610&longitude=-73.935242' \
--data-raw ''

Filtered response after making a request to the weather API - 

{  <br/>
    "temp": 18.41, <br/>
    "feels_like": 18.71, <br/>
    "temp_min": 16.08, <br/>
    "temp_max": 21.28, <br/>
    "country": "US", <br/>
    "city": "Long Island City" <br/>
} <br/>
