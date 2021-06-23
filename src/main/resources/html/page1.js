function alertTheDate() {
    $("#datetime").text(Date());
    setTimeout(alertTheDate, 500);
}

$(document).ready(function () {
    alertTheDate();
});

