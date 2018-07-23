/*
 * NicoScreen, version: 0.1 (2011-07-11)
 *
 *
 * For usage and examples, visit:
 * http://nicoscreen.r9game.com
 *
 * Licensed under the MIT:
 * http://www.opensource.org/licenses/mit-license.php
 *
 * Copyright (c) 2011, Shikemoku.MK (shikemoku.mk -[at]- gmail [*dot*] com)
 */

function escapeHtml(str) {
    str = str.replace(/&/g, '&amp;');
    str = str.replace(/</g, '&lt;');
    str = str.replace(/>/g, '&gt;');
    str = str.replace(/"/g, '&quot;');
    str = str.replace(/'/g, '&#39;');
    return str;
}

function convertCRLF(str) {
    return str.replace(/\r?\n/g, '  ');
}

function screenobj(o) {
    var f = screenobj.f, i, len, n, prop;
    f.prototype = o;
    n = new f;
    for (i=1, len=arguments.length; i<len; ++i)
        for (prop in arguments[i])
            n[prop] = arguments[i][prop];
    return n;
}
screenobj.f = function(){};

var r9 = {};
r9.Screen = {
    env : {
        color:"white",
        interval:500,
        speed:6500,
        font_size:"24px",
        loop:true,
        height:"",
        width:""
    },
    top_pos:20,
    draw_index:0,
    comments:[],
    set:function(o){
        this.comments = o.comments;
        if(o.base.color){
            this.env.color = o.base.color;
        }
        if(o.base.loop){
            this.env.loop = o.base.loop;
        }
        if(o.base.interval){
            switch(o.base.interval){
                case "fast":
                    this.env.interval=200;
                    break;
                case "slow":
                    this.env.interval=1000;
                    break;
            }
        }
        if(o.base.font_size){
            this.env.font_size = o.base.font_size;
        }
        if(o.base.speed){
            switch(o.base.speed){
                case "fast":
                    this.env.speed=4000;
                    break;
                case "slow":
                    this.env.speed=16000;
                    break;
            }
        }
    },
    start : function(){
        var elm = $("#screen");
        this.elm = elm;
        this.elm.css("position", "relative");
        this.elm.css("overflow", "hidden");
        this.elm.bind("selectstart",function(){return false;});
        this.elm.bind("mousedown",function(){return false;});
        this.env.width = ""+elm.css("width");
        this.env.height = ""+elm.css("height");
        this.env.width = this.env.width.replace("px","");
        this.env.height = this.env.height.replace("px","");
        inid = setInterval("screen.draw(null)", this.env.interval);

    },
    draw: function(str){
        var n = screen;
        var i = n.draw_index;
        var content_str =  "";
        if(str){
            content_str = str;
            i=parseInt((new Date)/1000);
        }else{
            if (n.draw_index >= n.comments.length) {
                if(n.env.loop) n.draw_index = 0;
                return false;
            }
            var comment = n.comments[i];
            var content_str = comment.content;
            var artist_name_str = comment.artist_name;
            var album_title_str = comment.album_title;
            var album_id = comment.album_id;
            var song_title_str = comment.song_title;
            var song_id = comment.song_id;
            var file_name_str = comment.file_name;
            var username_str = comment.username;
            var user_id = comment.user_id;
            n.draw_index++;
        }
        n.top_pos =  Math.floor( Math.random() * parseInt(n.env.height) );

        var min_font_size = 10;
        var max_font_size = 40;
        var min_font_size = (max_font_size - min_font_size) / 2;
        var font_size = Math.floor( Math.random() * (max_font_size - min_font_size) ) + min_font_size;
        var ajusted_font_size = 5;
        var width = font_size * content_str.length;
        var end_left = (parseInt(width)) * -1;
        var opacity = Math.floor(((1 / (max_font_size - min_font_size)) * (font_size - min_font_size)) * 10) / 10;
        var ajusted_opacity_value = 0.1;
        if (opacity >= 0.9)
            opacity = 1
        else if (opacity >= 0.3)
            opacity = opacity - 0.5
        else
            opacity -= opacity - 0.3

        if (opacity <= 0.3 && opacity >= 0.2 || opacity <= 0)
            return;

        var modalid = "modal" + i + "";
        var modal_obj = $("<div class='lyrics_modal' id='" + modalid + "' style='display: none;'>" + "<p class='comment'>" + convertCRLF(escapeHtml(content_str)) + "</p>" + "<p class='username'><a href='/users/" + user_id + "'>" + escapeHtml(username_str) + "</a></p>" + "<div class='lyrics_info'>"  + "<img src='" + escapeHtml(file_name_str) + "' class='album_img'>" + "<p class='artist_name'>" + escapeHtml(artist_name_str) + "</p>" + "<p class='album_title'><a href='/albums/" + album_id + "'>" + escapeHtml(album_title_str) + "</a></p>" + "<p class='song_title'><a href='/songs/" + song_id + "'>" + escapeHtml(song_title_str) + "</a></p>" + "</div>" + "</div>");

        var cmid = "cm" + i + "";
        var com_obj = $("<a href='#" + modalid + "' class='lyrics' id='" + cmid + "'style='left:" + n.env.width + "px; position:absolute;top:" + n.top_pos + "px;color:rgba(0,0,0," + opacity + ")" + ";font-size:" + font_size + "px" + ";width:" + width + "px" + ";'data-modal-id='" + modalid + "'>" + escapeHtml(content_str) + "</a>");
        $("#screen").append(com_obj);
        $("#screen").append(modal_obj);
        (function(that){
            var tmp_cmid = cmid;
            var tmp_modalid = modalid;
            com_obj.modaal({
                hide_close: true
            });
            com_obj.animate({
                left: end_left
            }, {
                duration: n.env.speed,
                complete: function(){
                    $("#" + tmp_cmid).remove();
                    $("#" + tmp_modalid).remove();
                    that.top_pos = 10;
                }
            });
        })(this);
    },
    add:function(str){
        this.draw(str);
    },
    stop: function(){
        $(".lyrics").stop();
        clearInterval(inid);
    },
    restart: function() {
        $(".lyrics").each(function(index, com_obj){
            $(com_obj).animate({
                left: (($(com_obj).width()) * -1) + "px"
            }, {
                duration: screen.env.speed,
                complete: function() {
                    var modalid = "#" + $(com_obj).data("modal-id");
                    $(com_obj).remove();
                    $(modalid).remove();
                }
            })
        });
        inid = setInterval("screen.draw(null)", this.env.interval);
    }
};

var screen = screenobj(r9.Screen);
