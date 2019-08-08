locals {
  common_tags = map(
  "name", local.name,
  "repository_url", "https://github.com/prateeka/lambda-scala-terraform.git"
  )
}