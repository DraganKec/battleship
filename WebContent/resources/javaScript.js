function personPicture() {

	var personSelectNumber = document.getElementById("personSelect").value;

	computerPicture()

	switch (personSelectNumber) {
	case "1":
		document.getElementById('personImage').src = "resources/images/rock.png";
		break;
	case "2":
		document.getElementById('personImage').src = "resources/images/paper.png";
		break;
	case "3":
		document.getElementById('personImage').src = "resources/images/scissors.png";
		break;
	}

}
function computerPicture(computerNumber) {

	
	switch (computerNumber) {
	case 1:
		document.getElementById('computerImage').src = "resources/images/rock.png";
		break;
	case 2:
		document.getElementById('computerImage').src = "resources/images/paper.png";
		break;
	case 3:
		document.getElementById('computerImage').src = "resources/images/scissors.png";
		break;
	}
}
