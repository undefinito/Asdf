<Global.Microsoft.VisualBasic.CompilerServices.DesignerGenerated()> _
Partial Class frmMain
    Inherits System.Windows.Forms.Form

    'Form overrides dispose to clean up the component list.
    <System.Diagnostics.DebuggerNonUserCode()> _
    Protected Overrides Sub Dispose(ByVal disposing As Boolean)
        Try
            If disposing AndAlso components IsNot Nothing Then
                components.Dispose()
            End If
        Finally
            MyBase.Dispose(disposing)
        End Try
    End Sub

    'Required by the Windows Form Designer
    Private components As System.ComponentModel.IContainer

    'NOTE: The following procedure is required by the Windows Form Designer
    'It can be modified using the Windows Form Designer.  
    'Do not modify it using the code editor.
    <System.Diagnostics.DebuggerStepThrough()> _
    Private Sub InitializeComponent()
        Dim resources As System.ComponentModel.ComponentResourceManager = New System.ComponentModel.ComponentResourceManager(GetType(frmMain))
        Me.cmdConnect = New System.Windows.Forms.Button
        Me.GroupBox2 = New System.Windows.Forms.GroupBox
        Me.cmdInit = New System.Windows.Forms.Button
        Me.cmbReader = New System.Windows.Forms.ComboBox
        Me.Label5 = New System.Windows.Forms.Label
        Me.GroupBox1 = New System.Windows.Forms.GroupBox
        Me.cmdClearLog = New System.Windows.Forms.Button
        Me.lstBoxLog = New System.Windows.Forms.ListBox
        Me.Label4 = New System.Windows.Forms.Label
        Me.GroupBox3 = New System.Windows.Forms.GroupBox
        Me.Label3 = New System.Windows.Forms.Label
        Me.Label2 = New System.Windows.Forms.Label
        Me.Label1 = New System.Windows.Forms.Label
        Me.txtCardATR = New System.Windows.Forms.TextBox
        Me.txtCardUID = New System.Windows.Forms.TextBox
        Me.txtCardType = New System.Windows.Forms.TextBox
        Me.MenuStrip1 = New System.Windows.Forms.MenuStrip
        Me.FileToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem
        Me.PICCToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem
        Me.InitializeReadersToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem
        Me.ConnectToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem
        Me.ToolStripSeparator1 = New System.Windows.Forms.ToolStripSeparator
        Me.ClearLogToolStripMenuItem = New System.Windows.Forms.ToolStripMenuItem
        Me.groupMifareStandard = New System.Windows.Forms.GroupBox
        Me.TabControl2 = New System.Windows.Forms.TabControl
        Me.TabPage4 = New System.Windows.Forms.TabPage
        Me.GroupBox6 = New System.Windows.Forms.GroupBox
        Me.Label16 = New System.Windows.Forms.Label
        Me.cmbKeyTypeRead = New System.Windows.Forms.ComboBox
        Me.k6R = New System.Windows.Forms.TextBox
        Me.k5R = New System.Windows.Forms.TextBox
        Me.k4R = New System.Windows.Forms.TextBox
        Me.k3R = New System.Windows.Forms.TextBox
        Me.k2R = New System.Windows.Forms.TextBox
        Me.k1R = New System.Windows.Forms.TextBox
        Me.checkHexRead = New System.Windows.Forms.CheckBox
        Me.cmdReadMifare = New System.Windows.Forms.Button
        Me.Label8 = New System.Windows.Forms.Label
        Me.txtDataRead = New System.Windows.Forms.TextBox
        Me.cmbBlockRead = New System.Windows.Forms.ComboBox
        Me.cmbSectorRead = New System.Windows.Forms.ComboBox
        Me.Label7 = New System.Windows.Forms.Label
        Me.Label6 = New System.Windows.Forms.Label
        Me.TabPage5 = New System.Windows.Forms.TabPage
        Me.GroupBox7 = New System.Windows.Forms.GroupBox
        Me.Label17 = New System.Windows.Forms.Label
        Me.cmbKeyTypeWrite = New System.Windows.Forms.ComboBox
        Me.k6W = New System.Windows.Forms.TextBox
        Me.k5W = New System.Windows.Forms.TextBox
        Me.k4W = New System.Windows.Forms.TextBox
        Me.k3W = New System.Windows.Forms.TextBox
        Me.k2W = New System.Windows.Forms.TextBox
        Me.k1W = New System.Windows.Forms.TextBox
        Me.checkHexWrite = New System.Windows.Forms.CheckBox
        Me.cmdMifareWrite = New System.Windows.Forms.Button
        Me.Label9 = New System.Windows.Forms.Label
        Me.txtDataWrite = New System.Windows.Forms.TextBox
        Me.cmbBlockWrite = New System.Windows.Forms.ComboBox
        Me.cmbSectorWrite = New System.Windows.Forms.ComboBox
        Me.Label10 = New System.Windows.Forms.Label
        Me.Label11 = New System.Windows.Forms.Label
        Me.TabPage6 = New System.Windows.Forms.TabPage
        Me.cmdFormatALLSectors = New System.Windows.Forms.Button
        Me.GroupBox5 = New System.Windows.Forms.GroupBox
        Me.checkDefaultAB = New System.Windows.Forms.CheckBox
        Me.Label15 = New System.Windows.Forms.Label
        Me.b6 = New System.Windows.Forms.TextBox
        Me.b5 = New System.Windows.Forms.TextBox
        Me.b4 = New System.Windows.Forms.TextBox
        Me.b1 = New System.Windows.Forms.TextBox
        Me.b3 = New System.Windows.Forms.TextBox
        Me.b2 = New System.Windows.Forms.TextBox
        Me.ab4 = New System.Windows.Forms.TextBox
        Me.ab1 = New System.Windows.Forms.TextBox
        Me.ab3 = New System.Windows.Forms.TextBox
        Me.ab2 = New System.Windows.Forms.TextBox
        Me.Label14 = New System.Windows.Forms.Label
        Me.a6 = New System.Windows.Forms.TextBox
        Me.Label12 = New System.Windows.Forms.Label
        Me.a5 = New System.Windows.Forms.TextBox
        Me.a4 = New System.Windows.Forms.TextBox
        Me.a1 = New System.Windows.Forms.TextBox
        Me.a3 = New System.Windows.Forms.TextBox
        Me.a2 = New System.Windows.Forms.TextBox
        Me.GroupBox4 = New System.Windows.Forms.GroupBox
        Me.Label18 = New System.Windows.Forms.Label
        Me.cmbKeyTypeWriteSector = New System.Windows.Forms.ComboBox
        Me.k6WS = New System.Windows.Forms.TextBox
        Me.k5WS = New System.Windows.Forms.TextBox
        Me.k4WS = New System.Windows.Forms.TextBox
        Me.k3WS = New System.Windows.Forms.TextBox
        Me.k2WS = New System.Windows.Forms.TextBox
        Me.k1WS = New System.Windows.Forms.TextBox
        Me.cmdFormatSector = New System.Windows.Forms.Button
        Me.cmbSectorTrailer = New System.Windows.Forms.ComboBox
        Me.Label13 = New System.Windows.Forms.Label
        Me.groupMifareDESFire = New System.Windows.Forms.GroupBox
        Me.TabControl1 = New System.Windows.Forms.TabControl
        Me.TabPage1 = New System.Windows.Forms.TabPage
        Me.TabPage2 = New System.Windows.Forms.TabPage
        Me.TabPage3 = New System.Windows.Forms.TabPage
        Me.GroupBox2.SuspendLayout()
        Me.GroupBox1.SuspendLayout()
        Me.GroupBox3.SuspendLayout()
        Me.MenuStrip1.SuspendLayout()
        Me.groupMifareStandard.SuspendLayout()
        Me.TabControl2.SuspendLayout()
        Me.TabPage4.SuspendLayout()
        Me.GroupBox6.SuspendLayout()
        Me.TabPage5.SuspendLayout()
        Me.GroupBox7.SuspendLayout()
        Me.TabPage6.SuspendLayout()
        Me.GroupBox5.SuspendLayout()
        Me.GroupBox4.SuspendLayout()
        Me.groupMifareDESFire.SuspendLayout()
        Me.TabControl1.SuspendLayout()
        Me.SuspendLayout()
        '
        'cmdConnect
        '
        Me.cmdConnect.Image = CType(resources.GetObject("cmdConnect.Image"), System.Drawing.Image)
        Me.cmdConnect.ImageAlign = System.Drawing.ContentAlignment.MiddleRight
        Me.cmdConnect.Location = New System.Drawing.Point(254, 66)
        Me.cmdConnect.Name = "cmdConnect"
        Me.cmdConnect.Size = New System.Drawing.Size(166, 42)
        Me.cmdConnect.TabIndex = 24
        Me.cmdConnect.Text = "Connect"
        Me.cmdConnect.UseVisualStyleBackColor = True
        '
        'GroupBox2
        '
        Me.GroupBox2.Controls.Add(Me.cmdInit)
        Me.GroupBox2.Controls.Add(Me.cmdConnect)
        Me.GroupBox2.Controls.Add(Me.cmbReader)
        Me.GroupBox2.Controls.Add(Me.Label5)
        Me.GroupBox2.Location = New System.Drawing.Point(577, 27)
        Me.GroupBox2.Name = "GroupBox2"
        Me.GroupBox2.Size = New System.Drawing.Size(429, 127)
        Me.GroupBox2.TabIndex = 22
        Me.GroupBox2.TabStop = False
        Me.GroupBox2.Text = "PC/SC Reader List"
        '
        'cmdInit
        '
        Me.cmdInit.Image = CType(resources.GetObject("cmdInit.Image"), System.Drawing.Image)
        Me.cmdInit.ImageAlign = System.Drawing.ContentAlignment.MiddleRight
        Me.cmdInit.Location = New System.Drawing.Point(82, 66)
        Me.cmdInit.Name = "cmdInit"
        Me.cmdInit.Size = New System.Drawing.Size(166, 42)
        Me.cmdInit.TabIndex = 25
        Me.cmdInit.Text = "Refresh List"
        Me.cmdInit.UseVisualStyleBackColor = True
        '
        'cmbReader
        '
        Me.cmbReader.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList
        Me.cmbReader.FormattingEnabled = True
        Me.cmbReader.Location = New System.Drawing.Point(9, 38)
        Me.cmbReader.Name = "cmbReader"
        Me.cmbReader.Size = New System.Drawing.Size(414, 22)
        Me.cmbReader.TabIndex = 15
        '
        'Label5
        '
        Me.Label5.BackColor = System.Drawing.Color.Black
        Me.Label5.Font = New System.Drawing.Font("Tw Cen MT", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label5.ForeColor = System.Drawing.Color.White
        Me.Label5.Location = New System.Drawing.Point(9, 20)
        Me.Label5.Name = "Label5"
        Me.Label5.Size = New System.Drawing.Size(414, 27)
        Me.Label5.TabIndex = 19
        Me.Label5.Text = "Select Reader"
        '
        'GroupBox1
        '
        Me.GroupBox1.Controls.Add(Me.cmdClearLog)
        Me.GroupBox1.Controls.Add(Me.lstBoxLog)
        Me.GroupBox1.Controls.Add(Me.Label4)
        Me.GroupBox1.Location = New System.Drawing.Point(577, 283)
        Me.GroupBox1.Name = "GroupBox1"
        Me.GroupBox1.Size = New System.Drawing.Size(429, 441)
        Me.GroupBox1.TabIndex = 23
        Me.GroupBox1.TabStop = False
        Me.GroupBox1.Text = "PCSC Output"
        '
        'cmdClearLog
        '
        Me.cmdClearLog.Image = CType(resources.GetObject("cmdClearLog.Image"), System.Drawing.Image)
        Me.cmdClearLog.ImageAlign = System.Drawing.ContentAlignment.MiddleRight
        Me.cmdClearLog.Location = New System.Drawing.Point(254, 393)
        Me.cmdClearLog.Name = "cmdClearLog"
        Me.cmdClearLog.Size = New System.Drawing.Size(166, 42)
        Me.cmdClearLog.TabIndex = 20
        Me.cmdClearLog.TabStop = False
        Me.cmdClearLog.Text = "Clear Log"
        Me.cmdClearLog.UseVisualStyleBackColor = True
        '
        'lstBoxLog
        '
        Me.lstBoxLog.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.lstBoxLog.FormattingEnabled = True
        Me.lstBoxLog.HorizontalScrollbar = True
        Me.lstBoxLog.ItemHeight = 14
        Me.lstBoxLog.Location = New System.Drawing.Point(6, 36)
        Me.lstBoxLog.Name = "lstBoxLog"
        Me.lstBoxLog.Size = New System.Drawing.Size(414, 352)
        Me.lstBoxLog.TabIndex = 18
        Me.lstBoxLog.TabStop = False
        '
        'Label4
        '
        Me.Label4.BackColor = System.Drawing.Color.Black
        Me.Label4.Font = New System.Drawing.Font("Tw Cen MT", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.Label4.ForeColor = System.Drawing.Color.White
        Me.Label4.Location = New System.Drawing.Point(6, 16)
        Me.Label4.Name = "Label4"
        Me.Label4.Size = New System.Drawing.Size(414, 28)
        Me.Label4.TabIndex = 19
        Me.Label4.Text = "Log"
        '
        'GroupBox3
        '
        Me.GroupBox3.Controls.Add(Me.Label3)
        Me.GroupBox3.Controls.Add(Me.Label2)
        Me.GroupBox3.Controls.Add(Me.Label1)
        Me.GroupBox3.Controls.Add(Me.txtCardATR)
        Me.GroupBox3.Controls.Add(Me.txtCardUID)
        Me.GroupBox3.Controls.Add(Me.txtCardType)
        Me.GroupBox3.Location = New System.Drawing.Point(577, 160)
        Me.GroupBox3.Name = "GroupBox3"
        Me.GroupBox3.Size = New System.Drawing.Size(429, 117)
        Me.GroupBox3.TabIndex = 24
        Me.GroupBox3.TabStop = False
        Me.GroupBox3.Text = "Card Information"
        '
        'Label3
        '
        Me.Label3.AutoSize = True
        Me.Label3.Location = New System.Drawing.Point(34, 84)
        Me.Label3.Name = "Label3"
        Me.Label3.Size = New System.Drawing.Size(28, 14)
        Me.Label3.TabIndex = 27
        Me.Label3.Text = "ATR"
        '
        'Label2
        '
        Me.Label2.AutoSize = True
        Me.Label2.Location = New System.Drawing.Point(39, 56)
        Me.Label2.Name = "Label2"
        Me.Label2.Size = New System.Drawing.Size(23, 14)
        Me.Label2.TabIndex = 26
        Me.Label2.Text = "UID"
        '
        'Label1
        '
        Me.Label1.AutoSize = True
        Me.Label1.Location = New System.Drawing.Point(5, 28)
        Me.Label1.Name = "Label1"
        Me.Label1.Size = New System.Drawing.Size(57, 14)
        Me.Label1.TabIndex = 25
        Me.Label1.Text = "Card Type"
        '
        'txtCardATR
        '
        Me.txtCardATR.BackColor = System.Drawing.Color.White
        Me.txtCardATR.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.txtCardATR.Font = New System.Drawing.Font("Arial", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtCardATR.Location = New System.Drawing.Point(68, 82)
        Me.txtCardATR.Name = "txtCardATR"
        Me.txtCardATR.ReadOnly = True
        Me.txtCardATR.Size = New System.Drawing.Size(355, 20)
        Me.txtCardATR.TabIndex = 2
        '
        'txtCardUID
        '
        Me.txtCardUID.BackColor = System.Drawing.Color.White
        Me.txtCardUID.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.txtCardUID.Font = New System.Drawing.Font("Arial", 14.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtCardUID.Location = New System.Drawing.Point(68, 47)
        Me.txtCardUID.Name = "txtCardUID"
        Me.txtCardUID.ReadOnly = True
        Me.txtCardUID.Size = New System.Drawing.Size(355, 29)
        Me.txtCardUID.TabIndex = 1
        '
        'txtCardType
        '
        Me.txtCardType.BackColor = System.Drawing.Color.White
        Me.txtCardType.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.txtCardType.Font = New System.Drawing.Font("Arial", 9.75!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtCardType.Location = New System.Drawing.Point(68, 19)
        Me.txtCardType.Name = "txtCardType"
        Me.txtCardType.ReadOnly = True
        Me.txtCardType.Size = New System.Drawing.Size(355, 22)
        Me.txtCardType.TabIndex = 0
        '
        'MenuStrip1
        '
        Me.MenuStrip1.Items.AddRange(New System.Windows.Forms.ToolStripItem() {Me.FileToolStripMenuItem})
        Me.MenuStrip1.Location = New System.Drawing.Point(0, 0)
        Me.MenuStrip1.Name = "MenuStrip1"
        Me.MenuStrip1.Size = New System.Drawing.Size(1018, 24)
        Me.MenuStrip1.TabIndex = 25
        Me.MenuStrip1.Text = "MenuStrip1"
        '
        'FileToolStripMenuItem
        '
        Me.FileToolStripMenuItem.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.PICCToolStripMenuItem, Me.ToolStripSeparator1, Me.ClearLogToolStripMenuItem})
        Me.FileToolStripMenuItem.Name = "FileToolStripMenuItem"
        Me.FileToolStripMenuItem.Size = New System.Drawing.Size(35, 20)
        Me.FileToolStripMenuItem.Text = "File"
        '
        'PICCToolStripMenuItem
        '
        Me.PICCToolStripMenuItem.DropDownItems.AddRange(New System.Windows.Forms.ToolStripItem() {Me.InitializeReadersToolStripMenuItem, Me.ConnectToolStripMenuItem})
        Me.PICCToolStripMenuItem.Name = "PICCToolStripMenuItem"
        Me.PICCToolStripMenuItem.Size = New System.Drawing.Size(130, 22)
        Me.PICCToolStripMenuItem.Text = "PICC"
        '
        'InitializeReadersToolStripMenuItem
        '
        Me.InitializeReadersToolStripMenuItem.Name = "InitializeReadersToolStripMenuItem"
        Me.InitializeReadersToolStripMenuItem.Size = New System.Drawing.Size(167, 22)
        Me.InitializeReadersToolStripMenuItem.Text = "Initialize Readers"
        '
        'ConnectToolStripMenuItem
        '
        Me.ConnectToolStripMenuItem.Name = "ConnectToolStripMenuItem"
        Me.ConnectToolStripMenuItem.Size = New System.Drawing.Size(167, 22)
        Me.ConnectToolStripMenuItem.Text = "Connect"
        '
        'ToolStripSeparator1
        '
        Me.ToolStripSeparator1.Name = "ToolStripSeparator1"
        Me.ToolStripSeparator1.Size = New System.Drawing.Size(127, 6)
        '
        'ClearLogToolStripMenuItem
        '
        Me.ClearLogToolStripMenuItem.Name = "ClearLogToolStripMenuItem"
        Me.ClearLogToolStripMenuItem.Size = New System.Drawing.Size(130, 22)
        Me.ClearLogToolStripMenuItem.Text = "Clear Log"
        '
        'groupMifareStandard
        '
        Me.groupMifareStandard.Controls.Add(Me.TabControl2)
        Me.groupMifareStandard.Enabled = False
        Me.groupMifareStandard.Location = New System.Drawing.Point(12, 27)
        Me.groupMifareStandard.Name = "groupMifareStandard"
        Me.groupMifareStandard.Size = New System.Drawing.Size(559, 357)
        Me.groupMifareStandard.TabIndex = 27
        Me.groupMifareStandard.TabStop = False
        Me.groupMifareStandard.Text = "MIFARE"
        '
        'TabControl2
        '
        Me.TabControl2.Controls.Add(Me.TabPage4)
        Me.TabControl2.Controls.Add(Me.TabPage5)
        Me.TabControl2.Controls.Add(Me.TabPage6)
        Me.TabControl2.Location = New System.Drawing.Point(6, 16)
        Me.TabControl2.Name = "TabControl2"
        Me.TabControl2.SelectedIndex = 0
        Me.TabControl2.Size = New System.Drawing.Size(543, 337)
        Me.TabControl2.TabIndex = 28
        '
        'TabPage4
        '
        Me.TabPage4.Controls.Add(Me.GroupBox6)
        Me.TabPage4.Controls.Add(Me.checkHexRead)
        Me.TabPage4.Controls.Add(Me.cmdReadMifare)
        Me.TabPage4.Controls.Add(Me.Label8)
        Me.TabPage4.Controls.Add(Me.txtDataRead)
        Me.TabPage4.Controls.Add(Me.cmbBlockRead)
        Me.TabPage4.Controls.Add(Me.cmbSectorRead)
        Me.TabPage4.Controls.Add(Me.Label7)
        Me.TabPage4.Controls.Add(Me.Label6)
        Me.TabPage4.Location = New System.Drawing.Point(4, 23)
        Me.TabPage4.Name = "TabPage4"
        Me.TabPage4.Padding = New System.Windows.Forms.Padding(3)
        Me.TabPage4.Size = New System.Drawing.Size(535, 310)
        Me.TabPage4.TabIndex = 0
        Me.TabPage4.Text = "Read"
        Me.TabPage4.UseVisualStyleBackColor = True
        '
        'GroupBox6
        '
        Me.GroupBox6.Controls.Add(Me.Label16)
        Me.GroupBox6.Controls.Add(Me.cmbKeyTypeRead)
        Me.GroupBox6.Controls.Add(Me.k6R)
        Me.GroupBox6.Controls.Add(Me.k5R)
        Me.GroupBox6.Controls.Add(Me.k4R)
        Me.GroupBox6.Controls.Add(Me.k3R)
        Me.GroupBox6.Controls.Add(Me.k2R)
        Me.GroupBox6.Controls.Add(Me.k1R)
        Me.GroupBox6.Location = New System.Drawing.Point(51, 71)
        Me.GroupBox6.Name = "GroupBox6"
        Me.GroupBox6.Size = New System.Drawing.Size(289, 73)
        Me.GroupBox6.TabIndex = 35
        Me.GroupBox6.TabStop = False
        Me.GroupBox6.Text = "Authentication"
        '
        'Label16
        '
        Me.Label16.AutoSize = True
        Me.Label16.Location = New System.Drawing.Point(6, 23)
        Me.Label16.Name = "Label16"
        Me.Label16.Size = New System.Drawing.Size(53, 14)
        Me.Label16.TabIndex = 36
        Me.Label16.Text = "Key Type"
        '
        'cmbKeyTypeRead
        '
        Me.cmbKeyTypeRead.AutoCompleteMode = System.Windows.Forms.AutoCompleteMode.SuggestAppend
        Me.cmbKeyTypeRead.AutoCompleteSource = System.Windows.Forms.AutoCompleteSource.ListItems
        Me.cmbKeyTypeRead.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList
        Me.cmbKeyTypeRead.FormattingEnabled = True
        Me.cmbKeyTypeRead.Items.AddRange(New Object() {"Default Key Type AA", "Default Key Type BB", "Default Key Type FF", "Key A", "Key B"})
        Me.cmbKeyTypeRead.Location = New System.Drawing.Point(82, 19)
        Me.cmbKeyTypeRead.Name = "cmbKeyTypeRead"
        Me.cmbKeyTypeRead.Size = New System.Drawing.Size(146, 22)
        Me.cmbKeyTypeRead.TabIndex = 35
        '
        'k6R
        '
        Me.k6R.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.k6R.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.k6R.Location = New System.Drawing.Point(196, 47)
        Me.k6R.MaxLength = 2
        Me.k6R.Name = "k6R"
        Me.k6R.Size = New System.Drawing.Size(32, 20)
        Me.k6R.TabIndex = 34
        '
        'k5R
        '
        Me.k5R.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.k5R.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.k5R.Location = New System.Drawing.Point(158, 47)
        Me.k5R.MaxLength = 2
        Me.k5R.Name = "k5R"
        Me.k5R.Size = New System.Drawing.Size(32, 20)
        Me.k5R.TabIndex = 33
        '
        'k4R
        '
        Me.k4R.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.k4R.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.k4R.Location = New System.Drawing.Point(120, 47)
        Me.k4R.MaxLength = 2
        Me.k4R.Name = "k4R"
        Me.k4R.Size = New System.Drawing.Size(32, 20)
        Me.k4R.TabIndex = 32
        '
        'k3R
        '
        Me.k3R.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.k3R.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.k3R.Location = New System.Drawing.Point(82, 47)
        Me.k3R.MaxLength = 2
        Me.k3R.Name = "k3R"
        Me.k3R.Size = New System.Drawing.Size(32, 20)
        Me.k3R.TabIndex = 31
        '
        'k2R
        '
        Me.k2R.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.k2R.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.k2R.Location = New System.Drawing.Point(44, 47)
        Me.k2R.MaxLength = 2
        Me.k2R.Name = "k2R"
        Me.k2R.Size = New System.Drawing.Size(32, 20)
        Me.k2R.TabIndex = 30
        '
        'k1R
        '
        Me.k1R.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.k1R.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.k1R.Location = New System.Drawing.Point(6, 47)
        Me.k1R.MaxLength = 2
        Me.k1R.Name = "k1R"
        Me.k1R.Size = New System.Drawing.Size(32, 20)
        Me.k1R.TabIndex = 29
        '
        'checkHexRead
        '
        Me.checkHexRead.AutoSize = True
        Me.checkHexRead.Location = New System.Drawing.Point(473, 155)
        Me.checkHexRead.Name = "checkHexRead"
        Me.checkHexRead.Size = New System.Drawing.Size(45, 18)
        Me.checkHexRead.TabIndex = 34
        Me.checkHexRead.Text = "Hex"
        Me.checkHexRead.UseVisualStyleBackColor = True
        '
        'cmdReadMifare
        '
        Me.cmdReadMifare.Image = CType(resources.GetObject("cmdReadMifare.Image"), System.Drawing.Image)
        Me.cmdReadMifare.ImageAlign = System.Drawing.ContentAlignment.MiddleRight
        Me.cmdReadMifare.Location = New System.Drawing.Point(301, 182)
        Me.cmdReadMifare.Name = "cmdReadMifare"
        Me.cmdReadMifare.Size = New System.Drawing.Size(166, 42)
        Me.cmdReadMifare.TabIndex = 33
        Me.cmdReadMifare.Text = "Read"
        Me.cmdReadMifare.UseVisualStyleBackColor = True
        '
        'Label8
        '
        Me.Label8.AutoSize = True
        Me.Label8.Location = New System.Drawing.Point(6, 156)
        Me.Label8.Name = "Label8"
        Me.Label8.Size = New System.Drawing.Size(29, 14)
        Me.Label8.TabIndex = 32
        Me.Label8.Text = "Data"
        '
        'txtDataRead
        '
        Me.txtDataRead.BackColor = System.Drawing.Color.White
        Me.txtDataRead.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.txtDataRead.Font = New System.Drawing.Font("Arial", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtDataRead.Location = New System.Drawing.Point(51, 150)
        Me.txtDataRead.Name = "txtDataRead"
        Me.txtDataRead.ReadOnly = True
        Me.txtDataRead.Size = New System.Drawing.Size(416, 26)
        Me.txtDataRead.TabIndex = 29
        Me.txtDataRead.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'cmbBlockRead
        '
        Me.cmbBlockRead.AutoCompleteMode = System.Windows.Forms.AutoCompleteMode.SuggestAppend
        Me.cmbBlockRead.AutoCompleteSource = System.Windows.Forms.AutoCompleteSource.ListItems
        Me.cmbBlockRead.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList
        Me.cmbBlockRead.FormattingEnabled = True
        Me.cmbBlockRead.Location = New System.Drawing.Point(51, 43)
        Me.cmbBlockRead.Name = "cmbBlockRead"
        Me.cmbBlockRead.Size = New System.Drawing.Size(121, 22)
        Me.cmbBlockRead.TabIndex = 31
        '
        'cmbSectorRead
        '
        Me.cmbSectorRead.AutoCompleteMode = System.Windows.Forms.AutoCompleteMode.SuggestAppend
        Me.cmbSectorRead.AutoCompleteSource = System.Windows.Forms.AutoCompleteSource.ListItems
        Me.cmbSectorRead.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList
        Me.cmbSectorRead.FormattingEnabled = True
        Me.cmbSectorRead.Location = New System.Drawing.Point(51, 15)
        Me.cmbSectorRead.Name = "cmbSectorRead"
        Me.cmbSectorRead.Size = New System.Drawing.Size(121, 22)
        Me.cmbSectorRead.TabIndex = 30
        '
        'Label7
        '
        Me.Label7.AutoSize = True
        Me.Label7.Location = New System.Drawing.Point(6, 46)
        Me.Label7.Name = "Label7"
        Me.Label7.Size = New System.Drawing.Size(33, 14)
        Me.Label7.TabIndex = 29
        Me.Label7.Text = "Block"
        '
        'Label6
        '
        Me.Label6.AutoSize = True
        Me.Label6.Location = New System.Drawing.Point(6, 18)
        Me.Label6.Name = "Label6"
        Me.Label6.Size = New System.Drawing.Size(39, 14)
        Me.Label6.TabIndex = 28
        Me.Label6.Text = "Sector"
        '
        'TabPage5
        '
        Me.TabPage5.Controls.Add(Me.GroupBox7)
        Me.TabPage5.Controls.Add(Me.checkHexWrite)
        Me.TabPage5.Controls.Add(Me.cmdMifareWrite)
        Me.TabPage5.Controls.Add(Me.Label9)
        Me.TabPage5.Controls.Add(Me.txtDataWrite)
        Me.TabPage5.Controls.Add(Me.cmbBlockWrite)
        Me.TabPage5.Controls.Add(Me.cmbSectorWrite)
        Me.TabPage5.Controls.Add(Me.Label10)
        Me.TabPage5.Controls.Add(Me.Label11)
        Me.TabPage5.Location = New System.Drawing.Point(4, 23)
        Me.TabPage5.Name = "TabPage5"
        Me.TabPage5.Padding = New System.Windows.Forms.Padding(3)
        Me.TabPage5.Size = New System.Drawing.Size(535, 310)
        Me.TabPage5.TabIndex = 1
        Me.TabPage5.Text = "Write"
        Me.TabPage5.UseVisualStyleBackColor = True
        '
        'GroupBox7
        '
        Me.GroupBox7.Controls.Add(Me.Label17)
        Me.GroupBox7.Controls.Add(Me.cmbKeyTypeWrite)
        Me.GroupBox7.Controls.Add(Me.k6W)
        Me.GroupBox7.Controls.Add(Me.k5W)
        Me.GroupBox7.Controls.Add(Me.k4W)
        Me.GroupBox7.Controls.Add(Me.k3W)
        Me.GroupBox7.Controls.Add(Me.k2W)
        Me.GroupBox7.Controls.Add(Me.k1W)
        Me.GroupBox7.Location = New System.Drawing.Point(51, 71)
        Me.GroupBox7.Name = "GroupBox7"
        Me.GroupBox7.Size = New System.Drawing.Size(289, 73)
        Me.GroupBox7.TabIndex = 44
        Me.GroupBox7.TabStop = False
        Me.GroupBox7.Text = "Authentication"
        '
        'Label17
        '
        Me.Label17.AutoSize = True
        Me.Label17.Location = New System.Drawing.Point(6, 23)
        Me.Label17.Name = "Label17"
        Me.Label17.Size = New System.Drawing.Size(53, 14)
        Me.Label17.TabIndex = 37
        Me.Label17.Text = "Key Type"
        '
        'cmbKeyTypeWrite
        '
        Me.cmbKeyTypeWrite.AutoCompleteMode = System.Windows.Forms.AutoCompleteMode.SuggestAppend
        Me.cmbKeyTypeWrite.AutoCompleteSource = System.Windows.Forms.AutoCompleteSource.ListItems
        Me.cmbKeyTypeWrite.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList
        Me.cmbKeyTypeWrite.FormattingEnabled = True
        Me.cmbKeyTypeWrite.Items.AddRange(New Object() {"Default Key Type AA", "Default Key Type BB", "Default Key Type FF", "Key A", "Key B"})
        Me.cmbKeyTypeWrite.Location = New System.Drawing.Point(82, 19)
        Me.cmbKeyTypeWrite.Name = "cmbKeyTypeWrite"
        Me.cmbKeyTypeWrite.Size = New System.Drawing.Size(146, 22)
        Me.cmbKeyTypeWrite.TabIndex = 35
        '
        'k6W
        '
        Me.k6W.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.k6W.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.k6W.Location = New System.Drawing.Point(196, 47)
        Me.k6W.Name = "k6W"
        Me.k6W.Size = New System.Drawing.Size(32, 20)
        Me.k6W.TabIndex = 34
        '
        'k5W
        '
        Me.k5W.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.k5W.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.k5W.Location = New System.Drawing.Point(158, 47)
        Me.k5W.Name = "k5W"
        Me.k5W.Size = New System.Drawing.Size(32, 20)
        Me.k5W.TabIndex = 33
        '
        'k4W
        '
        Me.k4W.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.k4W.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.k4W.Location = New System.Drawing.Point(120, 47)
        Me.k4W.Name = "k4W"
        Me.k4W.Size = New System.Drawing.Size(32, 20)
        Me.k4W.TabIndex = 32
        '
        'k3W
        '
        Me.k3W.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.k3W.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.k3W.Location = New System.Drawing.Point(82, 47)
        Me.k3W.Name = "k3W"
        Me.k3W.Size = New System.Drawing.Size(32, 20)
        Me.k3W.TabIndex = 31
        '
        'k2W
        '
        Me.k2W.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.k2W.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.k2W.Location = New System.Drawing.Point(44, 47)
        Me.k2W.Name = "k2W"
        Me.k2W.Size = New System.Drawing.Size(32, 20)
        Me.k2W.TabIndex = 30
        '
        'k1W
        '
        Me.k1W.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.k1W.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.k1W.Location = New System.Drawing.Point(6, 47)
        Me.k1W.Name = "k1W"
        Me.k1W.Size = New System.Drawing.Size(32, 20)
        Me.k1W.TabIndex = 29
        '
        'checkHexWrite
        '
        Me.checkHexWrite.AutoSize = True
        Me.checkHexWrite.Location = New System.Drawing.Point(473, 155)
        Me.checkHexWrite.Name = "checkHexWrite"
        Me.checkHexWrite.Size = New System.Drawing.Size(45, 18)
        Me.checkHexWrite.TabIndex = 43
        Me.checkHexWrite.Text = "Hex"
        Me.checkHexWrite.UseVisualStyleBackColor = True
        '
        'cmdMifareWrite
        '
        Me.cmdMifareWrite.Image = CType(resources.GetObject("cmdMifareWrite.Image"), System.Drawing.Image)
        Me.cmdMifareWrite.ImageAlign = System.Drawing.ContentAlignment.MiddleRight
        Me.cmdMifareWrite.Location = New System.Drawing.Point(301, 182)
        Me.cmdMifareWrite.Name = "cmdMifareWrite"
        Me.cmdMifareWrite.Size = New System.Drawing.Size(166, 42)
        Me.cmdMifareWrite.TabIndex = 42
        Me.cmdMifareWrite.Text = "Write"
        Me.cmdMifareWrite.UseVisualStyleBackColor = True
        '
        'Label9
        '
        Me.Label9.AutoSize = True
        Me.Label9.Location = New System.Drawing.Point(6, 156)
        Me.Label9.Name = "Label9"
        Me.Label9.Size = New System.Drawing.Size(29, 14)
        Me.Label9.TabIndex = 41
        Me.Label9.Text = "Data"
        '
        'txtDataWrite
        '
        Me.txtDataWrite.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.txtDataWrite.Font = New System.Drawing.Font("Arial", 12.0!, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.txtDataWrite.Location = New System.Drawing.Point(51, 150)
        Me.txtDataWrite.MaxLength = 16
        Me.txtDataWrite.Name = "txtDataWrite"
        Me.txtDataWrite.Size = New System.Drawing.Size(416, 26)
        Me.txtDataWrite.TabIndex = 37
        Me.txtDataWrite.TextAlign = System.Windows.Forms.HorizontalAlignment.Center
        '
        'cmbBlockWrite
        '
        Me.cmbBlockWrite.AutoCompleteMode = System.Windows.Forms.AutoCompleteMode.SuggestAppend
        Me.cmbBlockWrite.AutoCompleteSource = System.Windows.Forms.AutoCompleteSource.ListItems
        Me.cmbBlockWrite.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList
        Me.cmbBlockWrite.FormattingEnabled = True
        Me.cmbBlockWrite.Location = New System.Drawing.Point(51, 43)
        Me.cmbBlockWrite.Name = "cmbBlockWrite"
        Me.cmbBlockWrite.Size = New System.Drawing.Size(121, 22)
        Me.cmbBlockWrite.TabIndex = 40
        '
        'cmbSectorWrite
        '
        Me.cmbSectorWrite.AutoCompleteMode = System.Windows.Forms.AutoCompleteMode.SuggestAppend
        Me.cmbSectorWrite.AutoCompleteSource = System.Windows.Forms.AutoCompleteSource.ListItems
        Me.cmbSectorWrite.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList
        Me.cmbSectorWrite.FormattingEnabled = True
        Me.cmbSectorWrite.Location = New System.Drawing.Point(51, 15)
        Me.cmbSectorWrite.Name = "cmbSectorWrite"
        Me.cmbSectorWrite.Size = New System.Drawing.Size(121, 22)
        Me.cmbSectorWrite.TabIndex = 39
        '
        'Label10
        '
        Me.Label10.AutoSize = True
        Me.Label10.Location = New System.Drawing.Point(6, 46)
        Me.Label10.Name = "Label10"
        Me.Label10.Size = New System.Drawing.Size(33, 14)
        Me.Label10.TabIndex = 38
        Me.Label10.Text = "Block"
        '
        'Label11
        '
        Me.Label11.AutoSize = True
        Me.Label11.Location = New System.Drawing.Point(6, 18)
        Me.Label11.Name = "Label11"
        Me.Label11.Size = New System.Drawing.Size(39, 14)
        Me.Label11.TabIndex = 36
        Me.Label11.Text = "Sector"
        '
        'TabPage6
        '
        Me.TabPage6.Controls.Add(Me.cmdFormatALLSectors)
        Me.TabPage6.Controls.Add(Me.GroupBox5)
        Me.TabPage6.Controls.Add(Me.GroupBox4)
        Me.TabPage6.Controls.Add(Me.cmdFormatSector)
        Me.TabPage6.Controls.Add(Me.cmbSectorTrailer)
        Me.TabPage6.Controls.Add(Me.Label13)
        Me.TabPage6.Location = New System.Drawing.Point(4, 23)
        Me.TabPage6.Name = "TabPage6"
        Me.TabPage6.Size = New System.Drawing.Size(535, 310)
        Me.TabPage6.TabIndex = 2
        Me.TabPage6.Text = "Sector Trailer"
        Me.TabPage6.UseVisualStyleBackColor = True
        '
        'cmdFormatALLSectors
        '
        Me.cmdFormatALLSectors.Image = CType(resources.GetObject("cmdFormatALLSectors.Image"), System.Drawing.Image)
        Me.cmdFormatALLSectors.ImageAlign = System.Drawing.ContentAlignment.MiddleRight
        Me.cmdFormatALLSectors.Location = New System.Drawing.Point(51, 253)
        Me.cmdFormatALLSectors.Name = "cmdFormatALLSectors"
        Me.cmdFormatALLSectors.Size = New System.Drawing.Size(244, 42)
        Me.cmdFormatALLSectors.TabIndex = 52
        Me.cmdFormatALLSectors.Text = "Format All Sector Trailers"
        Me.cmdFormatALLSectors.UseVisualStyleBackColor = True
        '
        'GroupBox5
        '
        Me.GroupBox5.Controls.Add(Me.checkDefaultAB)
        Me.GroupBox5.Controls.Add(Me.Label15)
        Me.GroupBox5.Controls.Add(Me.b6)
        Me.GroupBox5.Controls.Add(Me.b5)
        Me.GroupBox5.Controls.Add(Me.b4)
        Me.GroupBox5.Controls.Add(Me.b1)
        Me.GroupBox5.Controls.Add(Me.b3)
        Me.GroupBox5.Controls.Add(Me.b2)
        Me.GroupBox5.Controls.Add(Me.ab4)
        Me.GroupBox5.Controls.Add(Me.ab1)
        Me.GroupBox5.Controls.Add(Me.ab3)
        Me.GroupBox5.Controls.Add(Me.ab2)
        Me.GroupBox5.Controls.Add(Me.Label14)
        Me.GroupBox5.Controls.Add(Me.a6)
        Me.GroupBox5.Controls.Add(Me.Label12)
        Me.GroupBox5.Controls.Add(Me.a5)
        Me.GroupBox5.Controls.Add(Me.a4)
        Me.GroupBox5.Controls.Add(Me.a1)
        Me.GroupBox5.Controls.Add(Me.a3)
        Me.GroupBox5.Controls.Add(Me.a2)
        Me.GroupBox5.Location = New System.Drawing.Point(51, 150)
        Me.GroupBox5.Name = "GroupBox5"
        Me.GroupBox5.Size = New System.Drawing.Size(416, 100)
        Me.GroupBox5.TabIndex = 36
        Me.GroupBox5.TabStop = False
        Me.GroupBox5.Text = "Sector Trailer Data"
        '
        'checkDefaultAB
        '
        Me.checkDefaultAB.AutoSize = True
        Me.checkDefaultAB.Location = New System.Drawing.Point(234, 41)
        Me.checkDefaultAB.Name = "checkDefaultAB"
        Me.checkDefaultAB.Size = New System.Drawing.Size(122, 18)
        Me.checkDefaultAB.TabIndex = 53
        Me.checkDefaultAB.Text = "Default Access Bits"
        Me.checkDefaultAB.UseVisualStyleBackColor = True
        '
        'Label15
        '
        Me.Label15.AutoSize = True
        Me.Label15.Location = New System.Drawing.Point(6, 69)
        Me.Label15.Name = "Label15"
        Me.Label15.Size = New System.Drawing.Size(36, 14)
        Me.Label15.TabIndex = 64
        Me.Label15.Text = "Key B"
        '
        'b6
        '
        Me.b6.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.b6.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.b6.Location = New System.Drawing.Point(272, 67)
        Me.b6.MaxLength = 2
        Me.b6.Name = "b6"
        Me.b6.Size = New System.Drawing.Size(32, 20)
        Me.b6.TabIndex = 63
        '
        'b5
        '
        Me.b5.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.b5.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.b5.Location = New System.Drawing.Point(234, 67)
        Me.b5.MaxLength = 2
        Me.b5.Name = "b5"
        Me.b5.Size = New System.Drawing.Size(32, 20)
        Me.b5.TabIndex = 62
        '
        'b4
        '
        Me.b4.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.b4.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.b4.Location = New System.Drawing.Point(196, 67)
        Me.b4.MaxLength = 2
        Me.b4.Name = "b4"
        Me.b4.Size = New System.Drawing.Size(32, 20)
        Me.b4.TabIndex = 61
        '
        'b1
        '
        Me.b1.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.b1.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.b1.Location = New System.Drawing.Point(82, 67)
        Me.b1.MaxLength = 2
        Me.b1.Name = "b1"
        Me.b1.Size = New System.Drawing.Size(32, 20)
        Me.b1.TabIndex = 58
        '
        'b3
        '
        Me.b3.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.b3.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.b3.Location = New System.Drawing.Point(158, 67)
        Me.b3.MaxLength = 2
        Me.b3.Name = "b3"
        Me.b3.Size = New System.Drawing.Size(32, 20)
        Me.b3.TabIndex = 60
        '
        'b2
        '
        Me.b2.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.b2.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.b2.Location = New System.Drawing.Point(120, 67)
        Me.b2.MaxLength = 2
        Me.b2.Name = "b2"
        Me.b2.Size = New System.Drawing.Size(32, 20)
        Me.b2.TabIndex = 59
        '
        'ab4
        '
        Me.ab4.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.ab4.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.ab4.Location = New System.Drawing.Point(196, 40)
        Me.ab4.MaxLength = 2
        Me.ab4.Name = "ab4"
        Me.ab4.Size = New System.Drawing.Size(32, 20)
        Me.ab4.TabIndex = 57
        '
        'ab1
        '
        Me.ab1.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.ab1.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.ab1.Location = New System.Drawing.Point(82, 40)
        Me.ab1.MaxLength = 2
        Me.ab1.Name = "ab1"
        Me.ab1.Size = New System.Drawing.Size(32, 20)
        Me.ab1.TabIndex = 54
        '
        'ab3
        '
        Me.ab3.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.ab3.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.ab3.Location = New System.Drawing.Point(158, 40)
        Me.ab3.MaxLength = 2
        Me.ab3.Name = "ab3"
        Me.ab3.Size = New System.Drawing.Size(32, 20)
        Me.ab3.TabIndex = 56
        '
        'ab2
        '
        Me.ab2.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.ab2.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.ab2.Location = New System.Drawing.Point(120, 40)
        Me.ab2.MaxLength = 2
        Me.ab2.Name = "ab2"
        Me.ab2.Size = New System.Drawing.Size(32, 20)
        Me.ab2.TabIndex = 55
        '
        'Label14
        '
        Me.Label14.AutoSize = True
        Me.Label14.Location = New System.Drawing.Point(6, 42)
        Me.Label14.Name = "Label14"
        Me.Label14.Size = New System.Drawing.Size(66, 14)
        Me.Label14.TabIndex = 53
        Me.Label14.Text = "Access Bits"
        '
        'a6
        '
        Me.a6.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.a6.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.a6.Location = New System.Drawing.Point(272, 14)
        Me.a6.MaxLength = 2
        Me.a6.Name = "a6"
        Me.a6.Size = New System.Drawing.Size(32, 20)
        Me.a6.TabIndex = 41
        '
        'Label12
        '
        Me.Label12.AutoSize = True
        Me.Label12.Location = New System.Drawing.Point(6, 16)
        Me.Label12.Name = "Label12"
        Me.Label12.Size = New System.Drawing.Size(37, 14)
        Me.Label12.TabIndex = 52
        Me.Label12.Text = "Key A"
        '
        'a5
        '
        Me.a5.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.a5.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.a5.Location = New System.Drawing.Point(234, 14)
        Me.a5.MaxLength = 2
        Me.a5.Name = "a5"
        Me.a5.Size = New System.Drawing.Size(32, 20)
        Me.a5.TabIndex = 40
        '
        'a4
        '
        Me.a4.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.a4.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.a4.Location = New System.Drawing.Point(196, 14)
        Me.a4.MaxLength = 2
        Me.a4.Name = "a4"
        Me.a4.Size = New System.Drawing.Size(32, 20)
        Me.a4.TabIndex = 39
        '
        'a1
        '
        Me.a1.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.a1.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.a1.Location = New System.Drawing.Point(82, 14)
        Me.a1.MaxLength = 2
        Me.a1.Name = "a1"
        Me.a1.Size = New System.Drawing.Size(32, 20)
        Me.a1.TabIndex = 36
        '
        'a3
        '
        Me.a3.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.a3.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.a3.Location = New System.Drawing.Point(158, 14)
        Me.a3.MaxLength = 2
        Me.a3.Name = "a3"
        Me.a3.Size = New System.Drawing.Size(32, 20)
        Me.a3.TabIndex = 38
        '
        'a2
        '
        Me.a2.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.a2.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.a2.Location = New System.Drawing.Point(120, 14)
        Me.a2.MaxLength = 2
        Me.a2.Name = "a2"
        Me.a2.Size = New System.Drawing.Size(32, 20)
        Me.a2.TabIndex = 37
        '
        'GroupBox4
        '
        Me.GroupBox4.Controls.Add(Me.Label18)
        Me.GroupBox4.Controls.Add(Me.cmbKeyTypeWriteSector)
        Me.GroupBox4.Controls.Add(Me.k6WS)
        Me.GroupBox4.Controls.Add(Me.k5WS)
        Me.GroupBox4.Controls.Add(Me.k4WS)
        Me.GroupBox4.Controls.Add(Me.k3WS)
        Me.GroupBox4.Controls.Add(Me.k2WS)
        Me.GroupBox4.Controls.Add(Me.k1WS)
        Me.GroupBox4.Location = New System.Drawing.Point(51, 71)
        Me.GroupBox4.Name = "GroupBox4"
        Me.GroupBox4.Size = New System.Drawing.Size(289, 73)
        Me.GroupBox4.TabIndex = 51
        Me.GroupBox4.TabStop = False
        Me.GroupBox4.Text = "Authentication"
        '
        'Label18
        '
        Me.Label18.AutoSize = True
        Me.Label18.Location = New System.Drawing.Point(6, 23)
        Me.Label18.Name = "Label18"
        Me.Label18.Size = New System.Drawing.Size(53, 14)
        Me.Label18.TabIndex = 37
        Me.Label18.Text = "Key Type"
        '
        'cmbKeyTypeWriteSector
        '
        Me.cmbKeyTypeWriteSector.AutoCompleteMode = System.Windows.Forms.AutoCompleteMode.SuggestAppend
        Me.cmbKeyTypeWriteSector.AutoCompleteSource = System.Windows.Forms.AutoCompleteSource.ListItems
        Me.cmbKeyTypeWriteSector.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList
        Me.cmbKeyTypeWriteSector.FormattingEnabled = True
        Me.cmbKeyTypeWriteSector.Items.AddRange(New Object() {"Default Key Type AA", "Default Key Type BB", "Default Key Type FF", "Key A", "Key B"})
        Me.cmbKeyTypeWriteSector.Location = New System.Drawing.Point(82, 19)
        Me.cmbKeyTypeWriteSector.Name = "cmbKeyTypeWriteSector"
        Me.cmbKeyTypeWriteSector.Size = New System.Drawing.Size(146, 22)
        Me.cmbKeyTypeWriteSector.TabIndex = 35
        '
        'k6WS
        '
        Me.k6WS.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.k6WS.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.k6WS.Location = New System.Drawing.Point(196, 47)
        Me.k6WS.Name = "k6WS"
        Me.k6WS.Size = New System.Drawing.Size(32, 20)
        Me.k6WS.TabIndex = 34
        '
        'k5WS
        '
        Me.k5WS.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.k5WS.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.k5WS.Location = New System.Drawing.Point(158, 47)
        Me.k5WS.Name = "k5WS"
        Me.k5WS.Size = New System.Drawing.Size(32, 20)
        Me.k5WS.TabIndex = 33
        '
        'k4WS
        '
        Me.k4WS.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.k4WS.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.k4WS.Location = New System.Drawing.Point(120, 47)
        Me.k4WS.Name = "k4WS"
        Me.k4WS.Size = New System.Drawing.Size(32, 20)
        Me.k4WS.TabIndex = 32
        '
        'k3WS
        '
        Me.k3WS.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.k3WS.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.k3WS.Location = New System.Drawing.Point(82, 47)
        Me.k3WS.Name = "k3WS"
        Me.k3WS.Size = New System.Drawing.Size(32, 20)
        Me.k3WS.TabIndex = 31
        '
        'k2WS
        '
        Me.k2WS.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.k2WS.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.k2WS.Location = New System.Drawing.Point(44, 47)
        Me.k2WS.Name = "k2WS"
        Me.k2WS.Size = New System.Drawing.Size(32, 20)
        Me.k2WS.TabIndex = 30
        '
        'k1WS
        '
        Me.k1WS.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle
        Me.k1WS.CharacterCasing = System.Windows.Forms.CharacterCasing.Upper
        Me.k1WS.Location = New System.Drawing.Point(6, 47)
        Me.k1WS.Name = "k1WS"
        Me.k1WS.Size = New System.Drawing.Size(32, 20)
        Me.k1WS.TabIndex = 29
        '
        'cmdFormatSector
        '
        Me.cmdFormatSector.Image = CType(resources.GetObject("cmdFormatSector.Image"), System.Drawing.Image)
        Me.cmdFormatSector.ImageAlign = System.Drawing.ContentAlignment.MiddleRight
        Me.cmdFormatSector.Location = New System.Drawing.Point(301, 253)
        Me.cmdFormatSector.Name = "cmdFormatSector"
        Me.cmdFormatSector.Size = New System.Drawing.Size(166, 42)
        Me.cmdFormatSector.TabIndex = 49
        Me.cmdFormatSector.Text = "Format Sector Trailer"
        Me.cmdFormatSector.UseVisualStyleBackColor = True
        '
        'cmbSectorTrailer
        '
        Me.cmbSectorTrailer.AutoCompleteMode = System.Windows.Forms.AutoCompleteMode.SuggestAppend
        Me.cmbSectorTrailer.AutoCompleteSource = System.Windows.Forms.AutoCompleteSource.ListItems
        Me.cmbSectorTrailer.DropDownStyle = System.Windows.Forms.ComboBoxStyle.DropDownList
        Me.cmbSectorTrailer.FormattingEnabled = True
        Me.cmbSectorTrailer.Location = New System.Drawing.Point(51, 15)
        Me.cmbSectorTrailer.Name = "cmbSectorTrailer"
        Me.cmbSectorTrailer.Size = New System.Drawing.Size(121, 22)
        Me.cmbSectorTrailer.TabIndex = 47
        '
        'Label13
        '
        Me.Label13.AutoSize = True
        Me.Label13.Location = New System.Drawing.Point(6, 18)
        Me.Label13.Name = "Label13"
        Me.Label13.Size = New System.Drawing.Size(39, 14)
        Me.Label13.TabIndex = 45
        Me.Label13.Text = "Sector"
        '
        'groupMifareDESFire
        '
        Me.groupMifareDESFire.Controls.Add(Me.TabControl1)
        Me.groupMifareDESFire.Enabled = False
        Me.groupMifareDESFire.Location = New System.Drawing.Point(12, 390)
        Me.groupMifareDESFire.Name = "groupMifareDESFire"
        Me.groupMifareDESFire.Size = New System.Drawing.Size(559, 334)
        Me.groupMifareDESFire.TabIndex = 28
        Me.groupMifareDESFire.TabStop = False
        Me.groupMifareDESFire.Text = "DESFire"
        Me.groupMifareDESFire.Visible = False
        '
        'TabControl1
        '
        Me.TabControl1.Controls.Add(Me.TabPage1)
        Me.TabControl1.Controls.Add(Me.TabPage2)
        Me.TabControl1.Controls.Add(Me.TabPage3)
        Me.TabControl1.Location = New System.Drawing.Point(6, 19)
        Me.TabControl1.Name = "TabControl1"
        Me.TabControl1.SelectedIndex = 0
        Me.TabControl1.Size = New System.Drawing.Size(547, 309)
        Me.TabControl1.TabIndex = 28
        '
        'TabPage1
        '
        Me.TabPage1.Location = New System.Drawing.Point(4, 23)
        Me.TabPage1.Name = "TabPage1"
        Me.TabPage1.Padding = New System.Windows.Forms.Padding(3)
        Me.TabPage1.Size = New System.Drawing.Size(539, 282)
        Me.TabPage1.TabIndex = 0
        Me.TabPage1.Text = "Authentication"
        Me.TabPage1.UseVisualStyleBackColor = True
        '
        'TabPage2
        '
        Me.TabPage2.Location = New System.Drawing.Point(4, 23)
        Me.TabPage2.Name = "TabPage2"
        Me.TabPage2.Padding = New System.Windows.Forms.Padding(3)
        Me.TabPage2.Size = New System.Drawing.Size(539, 282)
        Me.TabPage2.TabIndex = 1
        Me.TabPage2.Text = "Write"
        Me.TabPage2.UseVisualStyleBackColor = True
        '
        'TabPage3
        '
        Me.TabPage3.Location = New System.Drawing.Point(4, 23)
        Me.TabPage3.Name = "TabPage3"
        Me.TabPage3.Size = New System.Drawing.Size(539, 282)
        Me.TabPage3.TabIndex = 2
        Me.TabPage3.Text = "Read"
        Me.TabPage3.UseVisualStyleBackColor = True
        '
        'frmMain
        '
        Me.AutoScaleDimensions = New System.Drawing.SizeF(6.0!, 14.0!)
        Me.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font
        Me.ClientSize = New System.Drawing.Size(1018, 736)
        Me.Controls.Add(Me.groupMifareDESFire)
        Me.Controls.Add(Me.groupMifareStandard)
        Me.Controls.Add(Me.GroupBox3)
        Me.Controls.Add(Me.GroupBox1)
        Me.Controls.Add(Me.GroupBox2)
        Me.Controls.Add(Me.MenuStrip1)
        Me.Font = New System.Drawing.Font("Arial", 8.25!, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, CType(0, Byte))
        Me.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle
        Me.MainMenuStrip = Me.MenuStrip1
        Me.Name = "frmMain"
        Me.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen
        Me.Text = "All Card Tech PC/SC and Contacless Card Utility"
        Me.GroupBox2.ResumeLayout(False)
        Me.GroupBox1.ResumeLayout(False)
        Me.GroupBox3.ResumeLayout(False)
        Me.GroupBox3.PerformLayout()
        Me.MenuStrip1.ResumeLayout(False)
        Me.MenuStrip1.PerformLayout()
        Me.groupMifareStandard.ResumeLayout(False)
        Me.TabControl2.ResumeLayout(False)
        Me.TabPage4.ResumeLayout(False)
        Me.TabPage4.PerformLayout()
        Me.GroupBox6.ResumeLayout(False)
        Me.GroupBox6.PerformLayout()
        Me.TabPage5.ResumeLayout(False)
        Me.TabPage5.PerformLayout()
        Me.GroupBox7.ResumeLayout(False)
        Me.GroupBox7.PerformLayout()
        Me.TabPage6.ResumeLayout(False)
        Me.TabPage6.PerformLayout()
        Me.GroupBox5.ResumeLayout(False)
        Me.GroupBox5.PerformLayout()
        Me.GroupBox4.ResumeLayout(False)
        Me.GroupBox4.PerformLayout()
        Me.groupMifareDESFire.ResumeLayout(False)
        Me.TabControl1.ResumeLayout(False)
        Me.ResumeLayout(False)
        Me.PerformLayout()

    End Sub
    Friend WithEvents cmdConnect As System.Windows.Forms.Button
    Friend WithEvents GroupBox2 As System.Windows.Forms.GroupBox
    Friend WithEvents cmbReader As System.Windows.Forms.ComboBox
    Friend WithEvents Label5 As System.Windows.Forms.Label
    Friend WithEvents GroupBox1 As System.Windows.Forms.GroupBox
    Friend WithEvents lstBoxLog As System.Windows.Forms.ListBox
    Friend WithEvents Label4 As System.Windows.Forms.Label
    Friend WithEvents GroupBox3 As System.Windows.Forms.GroupBox
    Friend WithEvents Label3 As System.Windows.Forms.Label
    Friend WithEvents Label2 As System.Windows.Forms.Label
    Friend WithEvents Label1 As System.Windows.Forms.Label
    Friend WithEvents txtCardATR As System.Windows.Forms.TextBox
    Friend WithEvents txtCardUID As System.Windows.Forms.TextBox
    Friend WithEvents txtCardType As System.Windows.Forms.TextBox
    Friend WithEvents cmdClearLog As System.Windows.Forms.Button
    Friend WithEvents cmdInit As System.Windows.Forms.Button
    Friend WithEvents MenuStrip1 As System.Windows.Forms.MenuStrip
    Friend WithEvents FileToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents PICCToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents InitializeReadersToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents ConnectToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents groupMifareStandard As System.Windows.Forms.GroupBox
    Friend WithEvents TabControl2 As System.Windows.Forms.TabControl
    Friend WithEvents TabPage4 As System.Windows.Forms.TabPage
    Friend WithEvents TabPage5 As System.Windows.Forms.TabPage
    Friend WithEvents TabPage6 As System.Windows.Forms.TabPage
    Friend WithEvents Label7 As System.Windows.Forms.Label
    Friend WithEvents Label6 As System.Windows.Forms.Label
    Friend WithEvents groupMifareDESFire As System.Windows.Forms.GroupBox
    Friend WithEvents TabControl1 As System.Windows.Forms.TabControl
    Friend WithEvents TabPage1 As System.Windows.Forms.TabPage
    Friend WithEvents TabPage2 As System.Windows.Forms.TabPage
    Friend WithEvents TabPage3 As System.Windows.Forms.TabPage
    Friend WithEvents ToolStripSeparator1 As System.Windows.Forms.ToolStripSeparator
    Friend WithEvents ClearLogToolStripMenuItem As System.Windows.Forms.ToolStripMenuItem
    Friend WithEvents cmbBlockRead As System.Windows.Forms.ComboBox
    Friend WithEvents cmbSectorRead As System.Windows.Forms.ComboBox
    Friend WithEvents cmdReadMifare As System.Windows.Forms.Button
    Friend WithEvents Label8 As System.Windows.Forms.Label
    Friend WithEvents txtDataRead As System.Windows.Forms.TextBox
    Friend WithEvents checkHexRead As System.Windows.Forms.CheckBox
    Friend WithEvents GroupBox6 As System.Windows.Forms.GroupBox
    Friend WithEvents cmbKeyTypeRead As System.Windows.Forms.ComboBox
    Friend WithEvents k6R As System.Windows.Forms.TextBox
    Friend WithEvents k5R As System.Windows.Forms.TextBox
    Friend WithEvents k4R As System.Windows.Forms.TextBox
    Friend WithEvents k3R As System.Windows.Forms.TextBox
    Friend WithEvents k2R As System.Windows.Forms.TextBox
    Friend WithEvents k1R As System.Windows.Forms.TextBox
    Friend WithEvents GroupBox7 As System.Windows.Forms.GroupBox
    Friend WithEvents cmbKeyTypeWrite As System.Windows.Forms.ComboBox
    Friend WithEvents k6W As System.Windows.Forms.TextBox
    Friend WithEvents k5W As System.Windows.Forms.TextBox
    Friend WithEvents k4W As System.Windows.Forms.TextBox
    Friend WithEvents k3W As System.Windows.Forms.TextBox
    Friend WithEvents k2W As System.Windows.Forms.TextBox
    Friend WithEvents k1W As System.Windows.Forms.TextBox
    Friend WithEvents checkHexWrite As System.Windows.Forms.CheckBox
    Friend WithEvents cmdMifareWrite As System.Windows.Forms.Button
    Friend WithEvents Label9 As System.Windows.Forms.Label
    Friend WithEvents txtDataWrite As System.Windows.Forms.TextBox
    Friend WithEvents cmbBlockWrite As System.Windows.Forms.ComboBox
    Friend WithEvents cmbSectorWrite As System.Windows.Forms.ComboBox
    Friend WithEvents Label10 As System.Windows.Forms.Label
    Friend WithEvents Label11 As System.Windows.Forms.Label
    Friend WithEvents GroupBox4 As System.Windows.Forms.GroupBox
    Friend WithEvents cmbKeyTypeWriteSector As System.Windows.Forms.ComboBox
    Friend WithEvents k6WS As System.Windows.Forms.TextBox
    Friend WithEvents k5WS As System.Windows.Forms.TextBox
    Friend WithEvents k4WS As System.Windows.Forms.TextBox
    Friend WithEvents k3WS As System.Windows.Forms.TextBox
    Friend WithEvents k2WS As System.Windows.Forms.TextBox
    Friend WithEvents k1WS As System.Windows.Forms.TextBox
    Friend WithEvents cmdFormatSector As System.Windows.Forms.Button
    Friend WithEvents cmbSectorTrailer As System.Windows.Forms.ComboBox
    Friend WithEvents Label13 As System.Windows.Forms.Label
    Friend WithEvents GroupBox5 As System.Windows.Forms.GroupBox
    Friend WithEvents Label15 As System.Windows.Forms.Label
    Friend WithEvents b6 As System.Windows.Forms.TextBox
    Friend WithEvents b5 As System.Windows.Forms.TextBox
    Friend WithEvents b4 As System.Windows.Forms.TextBox
    Friend WithEvents b1 As System.Windows.Forms.TextBox
    Friend WithEvents b3 As System.Windows.Forms.TextBox
    Friend WithEvents b2 As System.Windows.Forms.TextBox
    Friend WithEvents ab4 As System.Windows.Forms.TextBox
    Friend WithEvents ab1 As System.Windows.Forms.TextBox
    Friend WithEvents ab3 As System.Windows.Forms.TextBox
    Friend WithEvents ab2 As System.Windows.Forms.TextBox
    Friend WithEvents Label14 As System.Windows.Forms.Label
    Friend WithEvents a6 As System.Windows.Forms.TextBox
    Friend WithEvents Label12 As System.Windows.Forms.Label
    Friend WithEvents a5 As System.Windows.Forms.TextBox
    Friend WithEvents a4 As System.Windows.Forms.TextBox
    Friend WithEvents a1 As System.Windows.Forms.TextBox
    Friend WithEvents a3 As System.Windows.Forms.TextBox
    Friend WithEvents a2 As System.Windows.Forms.TextBox
    Friend WithEvents cmdFormatALLSectors As System.Windows.Forms.Button
    Friend WithEvents Label16 As System.Windows.Forms.Label
    Friend WithEvents Label17 As System.Windows.Forms.Label
    Friend WithEvents Label18 As System.Windows.Forms.Label
    Friend WithEvents checkDefaultAB As System.Windows.Forms.CheckBox

End Class
