$(document).ready(function () {
    $("#searchBtn").on("click", function () {
        var maHS = $("#searchMaHS").val().toLowerCase();
        var hoDem = $("#searchHoDem").val().toLowerCase();
        var ten = $("#searchTen").val().toLowerCase();
        var lop = $("#searchLop").val().toLowerCase();

        $("#myTable tr").filter(function () {
            var match = true;
            if (maHS && $(this).find("td:nth-child(1)").text().toLowerCase().indexOf(maHS) === -1) {
                match = false;
            }
            if (hoDem && $(this).find(".ho_dem").text().toLowerCase().indexOf(hoDem) === -1) {
                match = false;
            }
            if (ten && $(this).find(".ten").text().toLowerCase().indexOf(ten) === -1) {
                match = false;
            }
            if (lop && $(this).find(".lop_id").text().toLowerCase().indexOf(lop) === -1) {
                match = false;
            }
            $(this).toggle(match);
        });
    });
});
