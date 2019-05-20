function loadForecast() {
	var cityId = $("#city").val();
	var temperatureUnit = $("input[name='unit']:checked").val();
	var days = $("#days").val();
	
	$("#tableBody").html("");
	
	$.ajax({
		  	url: "/forecast/" + cityId + "/" + temperatureUnit + "/" + days,
		}).done(function(data) {
			var tr = "";
			
			for (var weather in data) {
				tr = tr + "<tr>" +
			        "<td>" + data[weather].timestamp + "</td>" + 
			        "<td>" + data[weather].temperature + "</td>" +
			        "<td>" + data[weather].description + "</td>" +
			        "<td><img src='" + data[weather].imageUrl + "' alt='" + data[weather].description + "'/></td>" +        
			        "</tr>";
			}
			
			$("#tableBody").html(tr);
		});
}