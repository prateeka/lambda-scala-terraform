resource "aws_s3_bucket" "s3_bucket" {
  bucket = "lambda-scala-terraform-demo"
  acl = "private"

  tags = {
    repo-link = "https://github.com/prateeka/lambda-scala-terraform.git"
  }
}
