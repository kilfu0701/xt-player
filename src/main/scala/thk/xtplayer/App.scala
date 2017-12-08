package thk.xtplayer

import scala.collection.mutable
import scala.swing._
import javax.swing.{JMenuBar, JMenu}
//import thk.xtplayer.gui.MigPanel

class GUI extends MainFrame {
  title = "XT Player"

  preferredSize = new Dimension(320, 240)

  contents = new Label("Here is the contents!")

  menuBar = new MenuBar {
    contents += new Menu("File") {
      contents += new MenuItem(Action("Exit") {
        sys.exit(0)
      })
    }
  }
}

object App {
  def main(args: Array[String]) {
    val gui = new GUI
    gui.visible = true
    println("End of main function")
  }
}
