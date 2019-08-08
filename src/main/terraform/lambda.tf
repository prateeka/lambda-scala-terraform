resource "aws_lambda_function" "lambda_scala_terraformn_demo" {
  function_name = "lambda_scala_demo"
  handler = "in.arya.lambda.Handler"
  runtime = "java8"
  s3_bucket = local.s3_bucket
  s3_key = "${local.name}.jar"
  role = aws_iam_role.lambda_exec_role.arn
  tags = local.common_tags
  timeout = 15
  memory_size = 512
}