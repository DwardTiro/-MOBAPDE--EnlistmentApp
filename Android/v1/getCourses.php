<?php
require_once '../includes/DbOperations.php';

$response = array(); 

if($_SERVER['REQUEST_METHOD']=='POST'){
	if(isset($_POST['available'])){
		$db = new DbOperations(); 

			if($db->getCourses($_POST['available'])){
				$response['error'] = false;
				$response['course_id'] = $course['course_id'];
			
			}else{
				$response['error'] = true; 
				$response['message'] = "Failure establisihing connection with database";			
			}

	}
}

echo json_encode($response);
?>