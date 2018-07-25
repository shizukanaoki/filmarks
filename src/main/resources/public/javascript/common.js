$(function(){
    $('[type="submit"]').click(function(){
        $(this).prop('disabled',true);
        $(this).closest('form').submit();
    });
});