import BuildMaven

class BuildMavenSP{
    private final Script script

    BuildMavenSP(Script script){
        this.script  = script
    }

    void execute() {
        script.stage("Build") {

            Build()
            
        }
        script.stage("Deploy"){
            this.script.echo "Hello:)"
        }
    }

    void Build(){
        this.script.echo this.script.env
    }

    static void main(String[] args){
        
    }
}