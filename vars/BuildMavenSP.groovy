import Utility.check

class BuildMavenSP{
    private final Script script

    BuildMavenSP(Script script){
        this.script  = script
    }

    void execute() {
        script.stage("Build") {

            Build()
            check()
            
        }
        script.stage("Deploy"){
            this.script.echo "Hello:)"
        }
    }

    void Build(){
        this.script.echo this.script.env.VERSION
    }

    static void main(String[] args){
        
    }
}