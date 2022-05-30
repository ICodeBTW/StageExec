import com.SRE.Utility
import java.io.File
class BuildMavenSP{
    private final Script script

    BuildMavenSP(Script script){
        this.script  = script
    }

    void execute(Map config) {
        script.stage("Build") {
            this.script.echo config.example
             Utility.check(this.script)
            def outDir = new File("./out")
            outDir.makedir()
            
        }
        script.stage("Deploy"){
            this.script.echo "Hello:)"
        }
    }

    void Build(){
        this.script.echo (this.script.env.VERSION || "working")
    }

  
}

 