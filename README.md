This is Sample Project to create source code Zip, which can be uploaded to AWS Lambda.
 
Reference
http://docs.aws.amazon.com/lambda/latest/dg/create-deployment-pkg-zip-java.html

Changes in Gradle build file

1.
compile (
            'com.amazonaws:aws-lambda-java-core:1.1.0',
            'com.amazonaws:aws-lambda-java-events:1.1.0'
    )

    //Creating .zip Using Gradle Using Local Jars
    //compile fileTree(dir: 'jars', include: '*.jar')

2.
//project-dir/build/distributions/project-dir.zip
task buildZip(type: Zip) {
    from compileJava
    from processResources
    into('lib') {
        from configurations.runtime
    }
}

3.
build.dependsOn buildZip

Build Command:
gradle build

The Zip will be created inside
LambdaZipExample/build/distributions/testlambdazip-1.0-SNAPSHOT.zip

The Zip will contain libs folder which will contain all the dependant libraries and the class files which are part of this project.