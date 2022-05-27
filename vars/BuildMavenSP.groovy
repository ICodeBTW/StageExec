import BuildMaven

class BuildMavenSP{
    private final Script script

    BuildMavenSP(Script script){
        this.script  = script
    }

    void execute(String name, boolean param1) {
        script.stage("") {
            script.echo "Triggering ${name} stage..."
            script.sh "echo 'Execute your desired bash command here'"
            script.echo this.script.env.VERSION

            if (param1) {
                script.sh "echo 'Executing conditional command, because param1 == true'"
            }
        }
        script.stage("Stage 2")
    }
}