import BuildMaven

class BuildMavenSP{
    private final Script script

    BuildMavenSP(Script script){
        this.script  = script
    }

    void execute(Map config) {
        script.stage(config.name) {
            script.echo "Triggering ${name} stage..."
            script.sh "echo 'Execute your desired bash command here'"
            script.echo this.script.env.VERSION

            if (config.param1) {
                script.sh "echo 'Executing conditional command, because param1 == true'"
            }
        }
        script.stage("Stage 2")
    }

    static void main(String[] args){
        
    }
}