def BuildMavenFunc(Script script,String name){

    script.stage(name){
        script.echo "${name}"
    }

}