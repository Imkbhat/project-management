var chartDataStr = decodeHtml(chartData);//chartData from Home.html
var chartJsonArr = JSON.parse(chartDataStr);

var arrayLength = chartJsonArr.length;
var numericData =[];
var labelData = [];

for(var i=0;i<arrayLength; i++) {
	numericData[i] = chartJsonArr[i].value;
	labelData[i] = chartJsonArr[i].label;
}

// For a pie chart
new Chart(document.getElementById("myPieChart"), {
    type: 'pie',
 // The data for our dataset
    data: {
        labels: labelData,
        datasets: [{
            label: 'My First dataset',
            backgroundColor: ["#3e95cd","#8e5ea2","#3cba9f"],
            borderColor: 'rgb(255, 99, 132)',
            data: numericData
        }]
    },
    options: {
    	title :{
    		display : true,
    		text : 'Project Statuses'
    	}
    }
});

//[{"value": 1,"label":"INPROGRESS"},{}]
function decodeHtml(html) {
	var txt = document.createElement("textarea");
	txt.innerHTML = html;
	return txt.value;
}