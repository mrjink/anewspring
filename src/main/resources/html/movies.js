function getMovies() {
    console.log("Getting movies...");

    $.ajax({
        "url": "http://localhost:8080/api/movie/all",
        "type": "get",
        "success": function(result) {
            console.log("Success! " + result);

            $("#movies").html("");

            $.each(result, function (index, value) {
                $("#movies").append(
                    '<div class="movie">Movie ' + value.id + ', title: ' + value.title + ', watched: ' + value.watched + '</div>'
                );
            });
        }
    });
}
