package thk.xtplayer

import scala.collection.mutable
import scala.swing._
import javax.swing.{JMenuBar, JMenu, JPanel}
//import thk.xtplayer.gui.MigPanel
import thk.xtplayer.util.{ Logging }
import com.typesafe.config.ConfigFactory

class GUI extends MainFrame with Logging {

  log.info("initialize XT Player ...")

  //val settings = Settings()

  val lang = ConfigFactory.load("lang/en.conf");

  title = "XT Player"

  preferredSize = new Dimension(640, 480)

  //contents = new Label("Here is the contents!")

  //val panel = new
  //panel.setLayout(new GridLayout(0, 1))
  //contents += panel

  case class City(name: String, country: String, population: Int, capital: Boolean)
  val items = List(City("Lausanne", "Switzerland", 129273, false),
                            City("Paris", "France", 2203817, true), 
                            City("New York", "USA", 8363710 , false),
                            City("Berlin", "Germany", 3416300, true),
                            City("Tokio", "Japan", 12787981, true))
  import ListView._
  contents += new FlowPanel(new ScrollPane(new ListView(items) {
    renderer = Renderer(_.name)
  }))

  //contents += new FlowPanel(new Label("Event"))

  val menu_file = new Menu("File") {
    contents ++= Seq(
      new MenuItem(Action("Open file") { openFile() }),
      new MenuItem(Action("Open playlist") { openPlaylist() }),
      new Separator,
      new MenuItem(Action("Exit") { exitProc() }),
    )
  }

  menuBar = new MenuBar {
    contents += menu_file
  }

  def openFile() {
    log.info("openFile")
  }

  def openPlaylist() {
    log.info("openPlaylist")
  }

  def exitProc() {
    sys.exit(0)
  }
}

object App {
  def main(args: Array[String]) {
    val gui = new GUI
    gui.visible = true
    println("End of main function")
  }
}
