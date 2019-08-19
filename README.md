# lambda-scala-terraform
* prototype for creating aws lambda using scala + terraform. 

##### Usage:
   1. Build uber jar using "sbt" as shown below.
   1. Deploy the code using terraform command below.
   1. Invioke the aws lambda using the "test" command.

##### Commands:
* ###### Build
    * generate uber jar: `sbt assembly`
    * _(not needed if using terraform to push jar to s3)_ push above generated uber jar to s3 bucket (name listed in build.sbt): `sbt s3Upload`

* ###### Deploy 
    * creates: 
        * iam role 
        * s3 bucket for zip upload
        * lambda function: `terraform apply --auto-approve`

* ###### Test
    * `aws lambda invoke --function-name lambda_scala_demo --payload '{"firstName": "value1","lastName": "value2"}' --log-type Tail  --query 'LogResult' --output text out |  base64 -D`

###### Useful links
* `https://seanmcgary.com/posts/how-to-deploy-an-aws-lambda-with-terraform/`
* `http://queirozf.com/entries/creating-scala-fat-jars-for-spark-on-sbt-with-sbt-assembly-plugin`
* `https://github.com/FRosner/lambda-vs-beanstalk`
* `https://aws.amazon.com/blogs/compute/writing-aws-lambda-functions-in-scala/`
* `https://dev.to/frosnerd/deploying-an-http-api-on-aws-using-lambda-and-api-gateway-g61`
* [s3 plugin](https://github.com/sbt/sbt-s3)
* [assembly plugin](https://github.com/sbt/sbt-assembly)