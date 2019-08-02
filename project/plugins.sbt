//s3 plugin
resolvers += Resolver.url("sbts3 ivy resolver", url("https://dl.bintray.com/emersonloureiro/sbt-plugins"))(Resolver
  .ivyStylePatterns)
addSbtPlugin("cf.janga" % "sbts3" % "0.10.3")

//assembly plugin
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.10")