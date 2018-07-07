<html>
<head>
<meta charset="UTF-8">
<title>Alta alifiado</title>
<script type="text/javascript" src="jquery-3.3.1.js"></script>
<script  type= "text/javascript" src="funcionJS.js"></script>

</head>
<body>
      <h1>Alta Afiliado/Paciente</h1>
      <div>
           <form method="post" action="PacienteAction">
              <p>Nombre Y Apellido:
               <input type="text" id="nombreYApellido" ouinput="controlCaracter(id)"/>
               </p>
               
               <p>Nro. y  Tipo de Documento:
               <input type="number" id="DNI">
               <select id="tipoDNI">
                   <option value="dni">DNI</option>
                   <option value ="le">L.E</option>
                   <option value="lc">L.C</option>
               </select>
               
               <p>Domicilio:
                   <input type="text" id="direccion"/>    
               </p>                   
               
           <p>Telefono:
                    <input type="number" id="telefono" maxlength="10"/>
           </p>
           
           <p>Mail:
            <input type="email" id="mail"/>
           </p>
           
           <p>Fecha de Nacimiento:
              <input type="date" id="fechaDeNacimiento" />
           </p>
                       
           <p>Sexo:
            <select id="sexo">
                   <option value="Masculino">M</option>
                   <option value ="Femenino">F</option>
                   <option value="Indefinido">I</option>
               </select>
           <p>Estado Civil:
           <select id="estadoCivil">
                   <option value="Soltero/a">Soltero/a</option>
                   <option value ="Casado/a">Casado/a</option>
           </select>
           </p>
           
           <p>Cantidad de Hijo o Familiares a Cargo:
              <input type="number" id="cantidadHijos"/>
           </p>
           
           <p>Plan Medico:
           <input type="number" id="numeroPlan" size="7">
           </p>
           
           <p>N° de Afiliado:
              <select id="numeroPlan">
              <option value="PLAN OSDE 210">PLAN OSDE 210</option>
              <option value="PLAN OSDE 310">PLAN OSDE 310</option>
              <option value="PLAN OSDE 410">PLAN OSDE 410</option>
              <option value="PLAN OSDE 510">PLAN OSDE 510</option>
              </select>  
           </p>
           
           <p>
           <input type="submit" value="Registrar">
           </p>
           </form>
      </div>

</body>
</html>
