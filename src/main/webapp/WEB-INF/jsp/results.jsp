<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>

<c:url value="/results/marks" var="marksUrl"/>
<c:url value="/results/marksBySubject" var="marksBySubjectUrl"/>

<html>
<head>	
	<link rel='stylesheet' type='text/css' media='screen' href='<c:url value="/resources/css/bootstrap.css"/>'/>
	<script type='text/javascript' src='<c:url value="/resources/js/jquery-1.6.4.min.js"/>'></script>
	<script type='text/javascript' src='<c:url value="/resources/js/custom.js"/>'></script>

	<title>School Records</title>
	
	<script type='text/javascript'>
	$(function() {
		// init
		urlHolder.marks = '${marksUrl}';		
		urlHolder.marksBySubject = '${marksBySubjectUrl}';
		
		loadTableResults();
		
		 $('#subjectFilter').change(function() {		   
		   //alert($(this).val());		   
		   setBreadcrum($(this).val());
		   loadTableResults_onChange();
		 });
		 
		 $('#school').click(function() {
		   setOrderBy();
		   $('#sortBy').val('school');
		   //alert($('#orderBy').val());
		   //alert($('#sortBy').val());
		   setBreadcrum($('#subjectFilter').val());		   
		   loadTableResults_onChange();
		});
		 
		$('#y3').click(function() {
		   setOrderBy();
		   $('#sortBy').val('y3');		   
		   setBreadcrum($('#subjectFilter').val());
		   loadTableResults_onChange();
		});
		
		$('#y5').click(function() {
		   setOrderBy();
		   $('#sortBy').val('y5');		   
		   setBreadcrum($('#subjectFilter').val());
		   loadTableResults_onChange();
		});
		
		$('#y7').click(function() {
		   setOrderBy();
		   $('#sortBy').val('y7');		   
		   setBreadcrum($('#subjectFilter').val());
		   loadTableResults_onChange();
		});
		
		$('#y9').click(function() {
		   setOrderBy();
		   $('#sortBy').val('y9');		   
		   setBreadcrum($('#subjectFilter').val());
		   loadTableResults_onChange();
		});
		
		$('#rgy3y5').click(function() {
		   setOrderBy();
		   $('#sortBy').val('rgy3y5');		   
		   setBreadcrum($('#subjectFilter').val());
		   loadTableResults_onChange();
		});
		
		$('#fgy3y5').click(function() {
		   setOrderBy();
		   $('#sortBy').val('fgy3y5');		   
		   setBreadcrum($('#subjectFilter').val());
		   loadTableResults_onChange();
		});
		
		$('#cy3ty5').click(function() {
		   setOrderBy();
		   $('#sortBy').val('cy3ty5');		   
		   setBreadcrum($('#subjectFilter').val());
		   loadTableResults_onChange();
		});
		
		$('#gigy3toy5').click(function() {
		   setOrderBy();
		   $('#sortBy').val('gigy3toy5');		   
		   setBreadcrum($('#subjectFilter').val());
		   loadTableResults_onChange();
		});
	});
	</script>
</head>

<body>
  	
	<ul class="breadcrumb">
    <li><a href="#">Pines School District</a> <span class="divider">/</span></li>    
    <li id='banner' class="active">Reading</li>
    </ul>
        
    <div class="container-fluid">
    <div class="row-fluid">
    <div class="span10">    
  	
    <table id='tableResults' class="table table-bordered table-striped" >		
		<thead>
			<tr>
				<th>School<a id="school" class="pull-right" href="#"><i class="icon-resize-vertical"></i></a></th>
				<th>Y3<a id="y3" class="pull-right" href="#"><i class="icon-resize-vertical"></i></a></th>
				<th>Y5<a id="y5" class="pull-right" href="#"><i class="icon-resize-vertical"></i></a></th>
				<th>Y7<a id="y7" class="pull-right" href="#"><i class="icon-resize-vertical"></i></a></th>
				<th>Y9<a id="y9" class="pull-right" href="#"><i class="icon-resize-vertical"></i></a></th>
				<th>Raw Gain<br>Y3 to Y5<a id="rgy3y5" class="pull-right" href="#"><i class="icon-resize-vertical"></i></a></th>
				<th>Factored Gain<br>Y3 to Y5<a id="fgy3y5" class="pull-right" href="#"><i class="icon-resize-vertical"></i></a></th>
				<th>CLG%<br>Y3 to Y5<a id="cy3ty5" class="pull-right" href="#"><i class="icon-resize-vertical"></i></a></th>
				<th>Gain in Gain<br>Y3 to Y5<a id="gigy3toy5" class="pull-right" href="#"><i class="icon-resize-vertical"></i></a></th>
			</tr>
		</thead>
	</table>	
    </div>
    <div class="span2">
    <form>
  	<fieldset>
  	<input type="hidden" id="orderBy" name="orderBy" value="">
  	<input type="hidden" id="sortBy" name="sortBy" value="">    
	<div class="control-group info">
		<label class="control-label" for="inputInfo">Subject</label>
	    <div class="controls">
		  <select class="input-medium" id='subjectFilter'>
		    <option value='reading'>Reading</option>
	        <option value='spelling'>Spelling</option>
	        <option value='numeracy'>Numeracy</option>
	      </select>
	    <!-- span class="help-inline">***</span-->
	    </div>
	</div>
	</fieldset>
	</form>
    </div>
    </div>
    </div>
    
	
</body>
</html>