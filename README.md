# spring-boot-tailwind

### Install and Set up Tailwind CSS

We will install Tailwind CLI from the NPM; before that, let's init a new Node.js project by running this command at
the project root directory :

```shell
npm init -y
```

### Install the node package:

```shell
npm i -D tailwindcss
```

### Generate the Tailwind CSS configuration file with this command:

```shell
npx tailwindcss init
```

A file named "tailwind.config.js" will be generated; open it and replace the content with this one:

```javascript
module.exports = {
    content: ["./src/main/resources/templates/**/*.{html,js}"],
    theme: {
        extend: {},
    },
    plugins: [],
}
```

### Generate the CSS from Tailwind classes

We need to generate the required CSS using the CLI; the command requires two options:

* The input: The CSS entry file to use; this file usually contains the Tailwind CSS base CSS, the global CSS of the
  application, and the CSS of the external packages used in the project.
* The output: The path where to generate the CSS output.

Here is the command to run:

```shell
npx tailwindcss -i styles/input.css -o ./src/main/resources/static/css/main.css
```

### Watching Tailwind CSS classes

Every time you add or remove a class in your HMTL file, you need to rebuild your CSS file; this is not a good developer
experience.
Fortunately, the Tailwind CSS CLI provides an option to watch files and rebuild the CSS on change. Just add the option "
--watch" to the previous command.

```shell
npx tailwindcss -i styles/input.css -o ./src/main/resources/static/css/main.css --watch
```
