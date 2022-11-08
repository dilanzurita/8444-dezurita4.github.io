$(document).ready(function(){

    $(".contenedor-formularios").find("input, textarea").on("keyup blur focus", function (e) {

        var $this = $(this),
          label = $this.prev("label");

        if (e.type === "keyup") {
            if ($this.val() === "") {
                label.removeClass("active highlight");
            } else {
                label.addClass("active highlight");
            }
        } else if (e.type === "blur") {
            if($this.val() === "") {
                label.removeClass("active highlight");
                } else {
                label.removeClass("highlight");
                }
        } else if (e.type === "focus") {
            if($this.val() === "") {
                label.removeClass("highlight");
            }
            else if($this.val() !== "") {
                label.addClass("highlight");
            }
        }

    });

    $(".tab a").on("click", function (e) {

        e.preventDefault();

        $(this).parent().addClass("active");
        $(this).parent().siblings().removeClass("active");

        target = $(this).attr("href");

        $(".contenido-tab > div").not(target).hide();

        $(target).fadeIn(600);

    });

});

function showContent() {
    element = document.getElementById("content");
    check = document.getElementById("form");
    if (check.checked) {
        element.style.display='block';
    }
    else {
        element.style.display='none';
    }
}
function showContent2() {
    element = document.getElementById("content2");
    check2 = document.getElementById("form2");
    if (check2.checked) {
        element.style.display='block';
    }
    else {
        element.style.display='none';
    }
}
