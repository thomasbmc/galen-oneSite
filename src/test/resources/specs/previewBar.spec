@objects
    previewBar              xpath       //*[@id="previewBar"]
    show-previewBar         xpath       //*[@id="preview_show_bar"]
    menu1-previewBar        xpath       //*[@id="preview_bar_setup"]
    menu2-previewBar        xpath       //*[@id="preview_toggle_high_light"]
    menu3-previewBar        xpath       //*[@id="preview_bar_link"]


= Content =
    @on desktop
       previewBar:
            height  179 to 180px
            width   1349px

       show-previewBar:
            height  12 to 21px
            width   1349px
            text is "Hide preview bar"

       menu1-previewBar:
            aligned horizontally all menu2-previewBar
            width   266 to 270px
            height  35 to 38px
            text is "preview setup"

       menu2-previewBar:
            aligned horizontally all menu3-previewBar
            width   266 to 270px
            height  35 to 38px
            text is "turn highlights off"

       menu3-previewBar:
            width   266 to 270px
            height  35 to 38px
            text is "E-mail this Preview Link"



