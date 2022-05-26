class BuildMaven {
    private final Script script

    BuildMaven(Script script) {
        this.script = script
    }

    // You can pass as many parameters as needed
    void execute(String name, boolean param1) {
        script.echo "Triggering script with name == ${name}"
        script.sh "echo 'Execute your desired bash command here'"
        script.sh  VERSION

        if (param1) {
            script.sh "echo 'Executing conditional command, because param1 == true'"
        }
    }
}