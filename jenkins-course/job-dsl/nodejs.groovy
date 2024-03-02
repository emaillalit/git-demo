job('NodeJS-Exe-From-Seed') {
    scm {
        git('https://github.com/emaillalit/git-demo.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('DSL User')
            node / gitConfigEmail('email_lalit@hotmail.com')
        }
    }
    dir("jenkins-course/job-dsl") {
        sh "pwd"
    }
    triggers {
        scm('H/10 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
