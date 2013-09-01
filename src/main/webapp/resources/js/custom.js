/**
 * Custom JavaScript
 */
var urlHolder = new Object();

function loadTableResults() {
	$.get(urlHolder.marks, function(response) {
		createTableRows(response);		
	});
}

function loadTableResults_onChange() {
	$.post(urlHolder.marksBySubject, {
		subject : $('#subjectFilter').val(),
		sortBy: $('#sortBy').val(),
		orderBy: $('#orderBy').val()
	}, function(response) {
		createTableRows(response);		
	});
}

function createTableRows(response){
	$('#tableResults').find('tbody').remove();

	for ( var i = 0; i < response.results.length; i++) {
		var row = '<tr>';
		row += '<td><a href="#">' + response.results[i].school.schoolName + '</a></td>';
		row += '<td>' + toFixed(response.results[i].latestY3) + '</td>';
		row += '<td>' + toFixed(response.results[i].latestY5) + '</td>';
		row += '<td>' + toFixed(response.results[i].latestY7) + '</td>';
		row += '<td>' + toFixed(response.results[i].latestY9) + '</td>';
		row += '<td>' + toFixed(response.results[i].rawGainY3Y5) + '</td>';
		row += '<td>' + toFixed(response.results[i].factoredGainY3Y5) + '</td>';
		row += '<td>' + toFixed(response.results[i].glgY3Y5) + '</td>';
		row += '<td>' + toFixed(response.results[i].latestGainInGainY3Y5) + '</td>';
		row += '</tr>';
		$('#tableResults').append(row);
	}
	$('#tableResults').data('model', response.results);
}

function toFixed(number) {
	return number.toFixed(2);
}

function setOrderBy(){
	if($('#orderBy').val()=='' || $('#orderBy').val()=='D'){
		 $('#orderBy').val('A'); 
	 }else{
		 $('#orderBy').val('D');
	 }
}

function setBreadcrum(val){
	$('#banner').text(val);
	$('#banner').css('textTransform', 'capitalize');	
}