@param String title

<head>
    <meta charset="UTF-8">
    <title>${title}</title>

    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <link rel="stylesheet" type="text/css" href="/assets/tailwind.css">
    <link rel="stylesheet" type="text/css" href="/assets/main.css">
    <link rel="icon" type="image/svg+xml" href="/assets/favicon.svg" sizes="any"/>

    <link rel="stylesheet" type="text/css" href="/webjars/unpoly/2.6.0/unpoly.min.css">

    <script type="importmap">
            {
              "imports": {
                "stimulus": "/webjars/hotwired__stimulus/3.0.1/dist/stimulus.js",
                "unpoly":   "/webjars/unpoly/2.6.0/unpoly.min.js"
              }
            }


    </script>

    <script type="module">
        import "unpoly"

        //up.fragment.config.navigateOptions.focus = false // stop highlighting changed fragment when navigating links

        import { Application } from "stimulus"
        import ExampleController from "/assets/controllers/example_controller.js"

        window.Stimulus = Application.start()
        Stimulus.register("example", ExampleController)

        @if(com.example.demo.utils.Dev.isDevMode())
        up.log.enable() // enable unpoly logging for console
        @endif

    </script>

</head>