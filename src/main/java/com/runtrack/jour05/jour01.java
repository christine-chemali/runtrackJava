/*
 * JOUR 05 JOB 01 Installation de JavaFx
 * Dans ce job l'objectif est d'installer JavaFx
 * sur notre installatin, pour cela 3 choix sont possibles
 *  - Installation manuelle
 *  - Installation avec Maven
 *  - Installation avec Gradle
 * Le but est de comprendre comment gérer 
 * les dépendances de nos projets et comment intaller
 * des librairies
 * Se renseigner sur Gradle et Maven avant d'en choisir un
 *  Résultat attendu
 * -> un projet Java avec JavaFx installé 
 */

 /* =========================================================
 *   POM.XML pour JAVAfx avec tests sans arborescence MVN
 * =========================================================
 */
 //pom.xml qui fonctionne avec un fichier App javafx à utiliser sans run.bat
 //compilation et execute ok avec mvn 

// <?xml version="1.0" encoding="UTF-8"?>
// <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//   xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
//   <modelVersion>4.0.0</modelVersion>
//   <groupId>com.runtrack</groupId>
//   <artifactId>runtrackjava</artifactId>
//   <version>1.0-SNAPSHOT</version>
//   <name>runtrackjava</name>
//   <url>http://www.example.com</url>
  
//   <properties>
//     <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
//     <maven.compiler.source>17</maven.compiler.source>
//     <maven.compiler.target>17</maven.compiler.target>
//     <javafx.version>21.0.1</javafx.version>
//   </properties>
  
//   <dependencies>
//     <!-- JUnit pour les tests -->
//     <dependency>
//       <groupId>junit</groupId>
//       <artifactId>junit</artifactId>
//       <version>4.11</version>
//       <scope>test</scope>
//     </dependency>
    
//     <!-- JavaFX Controls -->
//     <dependency>
//       <groupId>org.openjfx</groupId>
//       <artifactId>javafx-controls</artifactId>
//       <version>${javafx.version}</version>
//     </dependency>
    
//     <!-- JavaFX FXML (optionnel, pour les interfaces FXML) -->
//     <dependency>
//       <groupId>org.openjfx</groupId>
//       <artifactId>javafx-fxml</artifactId>
//       <version>${javafx.version}</version>
//     </dependency>
    
//     <!-- JavaFX Media (optionnel, pour audio/vidéo) -->
//     <dependency>
//       <groupId>org.openjfx</groupId>
//       <artifactId>javafx-media</artifactId>
//       <version>${javafx.version}</version>
//     </dependency>
    
//     <!-- JavaFX Web (optionnel, pour WebView) -->
//     <dependency>
//       <groupId>org.openjfx</groupId>
//       <artifactId>javafx-web</artifactId>
//       <version>${javafx.version}</version>
//     </dependency>
//   </dependencies>
  
//   <build>
//     <pluginManagement>
//       <plugins>
//         <plugin>
//           <artifactId>maven-clean-plugin</artifactId>
//           <version>3.1.0</version>
//         </plugin>
//         <plugin>
//           <artifactId>maven-resources-plugin</artifactId>
//           <version>3.0.2</version>
//         </plugin>
//         <plugin>
//           <artifactId>maven-compiler-plugin</artifactId>
//           <version>3.8.0</version>
//         </plugin>
//         <plugin>
//           <artifactId>maven-surefire-plugin</artifactId>
//           <version>2.22.1</version>
//         </plugin>
//         <plugin>
//           <artifactId>maven-install-plugin</artifactId>
//           <version>2.5.2</version>
//         </plugin>
//         <plugin>
//           <artifactId>maven-deploy-plugin</artifactId>
//           <version>2.8.2</version>
//         </plugin>
//         <plugin>
//           <artifactId>maven-site-plugin</artifactId>
//           <version>3.7.1</version>
//         </plugin>
//         <plugin>
//           <artifactId>maven-project-info-reports-plugin</artifactId>
//           <version>3.0.0</version>
//         </plugin>
//       </plugins>
//     </pluginManagement>
    
//     <plugins>
//       <!-- Plugin JavaFX Maven -->
//       <plugin>
//         <groupId>org.openjfx</groupId>
//         <artifactId>javafx-maven-plugin</artifactId>
//         <version>0.0.8</version>
//         <configuration>
//           <mainClass>com.runtrack.App</mainClass>
//         </configuration>
//       </plugin>
      
//       <!-- Plugin exec pour lancer l'application -->
//       <plugin>
//         <groupId>org.codehaus.mojo</groupId>
//         <artifactId>exec-maven-plugin</artifactId>
//         <version>3.2.0</version>
//         <configuration>
//           <mainClass>com.runtrack.App</mainClass>
//           <commandlineArgs>--module-path ${javafx.runtime.path} --add-modules javafx.controls,javafx.fxml</commandlineArgs>
//         </configuration>
//       </plugin>
//     </plugins>
//   </build>
// </project>

/* =========================================================
 *           POM.XML pour JAVA sans fx avec tests MVN
 * =========================================================
 */
/// fichier pom qui donne en sortie une arborescence pour les fichiers tests en 
/// compilant et executant mvn test - sans javafx

// <?xml version="1.0" encoding="UTF-8"?>
// <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//   xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
//   <modelVersion>4.0.0</modelVersion>
//   <groupId>com.globalconverter</groupId>
//   <artifactId>globalconverter</artifactId>
//   <version>1.0-SNAPSHOT</version>
//   <name>globalconverter</name>
//   <url>http://www.example.com</url>
//   <properties>
//     <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
//     <maven.compiler.source>17</maven.compiler.source>
//     <maven.compiler.target>17</maven.compiler.target>
//   </properties>
  
// 	<dependencyManagement>
// 		<dependencies>
// 			<dependency>
// 				<groupId>org.junit</groupId>
// 				<artifactId>junit-bom</artifactId>
// 				<version>5.13.2</version>
// 				<type>pom</type>
// 				<scope>import</scope>
// 			</dependency>
// 		</dependencies>
// 	</dependencyManagement>

// 	<dependencies>
// 		<dependency>
// 			<groupId>org.junit.jupiter</groupId>
// 			<artifactId>junit-jupiter</artifactId>
// 			<scope>test</scope>
// 		</dependency>
// 	</dependencies>

//   <build>
//     <pluginManagement>
//       <plugins>
//         <plugin>
//           <artifactId>maven-clean-plugin</artifactId>
//           <version>3.2.0</version>
//         </plugin>
//         <plugin>
//           <artifactId>maven-resources-plugin</artifactId>
//           <version>3.3.0</version>
//         </plugin>
//         <plugin>
//           <artifactId>maven-compiler-plugin</artifactId>
//           <version>3.11.0</version>
//         </plugin>

//         <!-- Maven Surefire Plugin
//         -->
//         <plugin>
//           <artifactId>maven-surefire-plugin</artifactId>
//           <version>3.5.3</version>
//             <dependencies>
//                 <dependency>
//                     <groupId>me.fabriciorby</groupId>
//                     <artifactId>maven-surefire-junit5-tree-reporter</artifactId>
//                     <version>0.1.0</version>
//                 </dependency>
//             </dependencies>
//             <configuration>
//                 <reportFormat>plain</reportFormat>
//                 <consoleOutputReporter>
//                     <disable>true</disable>
//                 </consoleOutputReporter>
//                 <statelessTestsetInfoReporter implementation="org.apache.maven.plugin.surefire.extensions.junit5.JUnit5StatelessTestsetInfoTreeReporter"/>
//             </configuration>
//         </plugin>

//         <!-- Maven Jar Plugin
//             -->
//         <plugin>
//           <artifactId>maven-jar-plugin</artifactId>
//           <version>3.3.0</version>
//         </plugin>

//         <!-- Maven Install Plugin
//         -->
//         <plugin>
//           <artifactId>maven-install-plugin</artifactId>
//           <version>3.1.0</version>
//         </plugin>

//         <!-- Maven Deploy Plugin
//         -->
//         <plugin>
//           <artifactId>maven-deploy-plugin</artifactId>
//           <version>3.1.0</version>
//         </plugin>

//         <!-- Maven Site Plugin
//         -->
//         <plugin>
//           <artifactId>maven-site-plugin</artifactId>
//           <version>4.0.0-M4</version>
//         </plugin>

//         <!-- Maven Project in Plugin
//         -->
//         <plugin>
//           <artifactId>maven-project-info-reports-plugin</artifactId>
//           <version>3.4.1</version>
//         </plugin>
//       </plugins>
//     </pluginManagement>
//   </build>
// </project>

