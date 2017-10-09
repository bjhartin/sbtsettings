cancelable in Global := true

import com.scalapenos.sbt.prompt._
import SbtPrompt.autoImport._

lazy val customTheme1 = PromptTheme(List(
        gitBranch(clean = fg(green), dirty = fg(yellow)),
        text(" in ", fg(red)),
        currentProject(fg(magenta)),
	text("> ", fg(red))
      ))

promptTheme := customTheme1 
