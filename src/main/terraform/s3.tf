resource "aws_s3_bucket" "s3_bucket" {
  bucket = local.s3_bucket
  acl = "private"

  tags = local.common_tags
}

resource "aws_s3_bucket_object" "object" {
  bucket = local.s3_bucket
  key = "${local.s3_bucket}.jar"
  source = "../../../target/scala-2.13/${local.s3_bucket}.jar"

  depends_on = [
    aws_s3_bucket.s3_bucket]
}

