@startuml
Client --> Server: LOGIN
Client <-- Server: LOGIN_ERFOLGREICH:<idNummer>
Client --> Server: LEVEL
Client <-- Server: LEVEL_EINGELOGGT:<level>
Client --> Server: HELDEN_AUSWAHL:<heldenNummer>
Client <-- Server: HELD_EINGELOGGT
@enduml
