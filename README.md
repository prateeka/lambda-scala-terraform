# lambda-scala-terraform
* prototype for creating aws lambda using scala + terraform


###### Commands:
* generate uber jar
    * assembly
* push above generated uber jar to s3 bucket (name listed in build.sbt)
    * s3Upload

###### Useful links
* `https://seanmcgary.com/posts/how-to-deploy-an-aws-lambda-with-terraform/`
* `http://queirozf.com/entries/creating-scala-fat-jars-for-spark-on-sbt-with-sbt-assembly-plugin`
* `https://github.com/FRosner/lambda-vs-beanstalk`
* `https://aws.amazon.com/blogs/compute/writing-aws-lambda-functions-in-scala/`
* `https://dev.to/frosnerd/deploying-an-http-api-on-aws-using-lambda-and-api-gateway-g61`
* [s3 plugin](https://github.com/sbt/sbt-s3)
* [assembly plugin](https://github.com/sbt/sbt-assembly)