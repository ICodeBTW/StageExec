def BuildMavenF(Script script,String name){

    script.stage(name){
        script.echo "${name}"
    }

}