; Script generated by the Inno Setup Script Wizard.
; SEE THE DOCUMENTATION FOR DETAILS ON CREATING INNO SETUP SCRIPT FILES!

[Setup]
; NOTE: The value of AppId uniquely identifies this application.
; Do not use the same AppId value in installers for other applications.
; (To generate a new GUID, click Tools | Generate GUID inside the IDE.)
AppId={{0E8296CF-7894-449F-9413-4850235B6791}
AppName=Aventura de Bolsillo
AppVersion=2.1
;AppVerName=Aventura de Bolsillo 2.1
DefaultDirName={pf}\Aventura de Bolsillo
DisableDirPage=yes
DefaultGroupName=Aventura de Bolsillo
OutputDir=C:\Users\Nacho\Desktop\Aventura de Bolsillo\Instalable
OutputBaseFilename=Aventura de Bolsillo
Compression=lzma
SolidCompression=yes

[Languages]
Name: "english"; MessagesFile: "compiler:Default.isl"
Name: "spanish"; MessagesFile: "compiler:Languages\Spanish.isl"

[Tasks]
Name: "desktopicon"; Description: "{cm:CreateDesktopIcon}"; GroupDescription: "{cm:AdditionalIcons}"; Flags: unchecked

[Files]
Source: "D:\CGS DAM\1º DAM\Programación\Proyectos NetBeans\GitRepository\proyectoProg85\dist\ProyectoProg.jar"; DestDir: "{app}"; Flags: ignoreversion
Source: "D:\CGS DAM\1º DAM\Programación\Proyectos NetBeans\GitRepository\proyectoProg85\dist\*"; DestDir: "{app}"; Flags: ignoreversion recursesubdirs createallsubdirs
; NOTE: Don't use "Flags: ignoreversion" on any shared system files

[Icons]
Name: "{group}\Aventura de Bolsillo"; Filename: "{app}\ProyectoProg.jar"
Name: "{group}\{cm:UninstallProgram,Aventura de Bolsillo}"; Filename: "{uninstallexe}"
Name: "{commondesktop}\Aventura de Bolsillo"; Filename: "{app}\ProyectoProg.jar"; Tasks: desktopicon

[Run]
Filename: "{app}\ProyectoProg.jar"; Description: "{cm:LaunchProgram,Aventura de Bolsillo}"; Flags: shellexec postinstall skipifsilent

